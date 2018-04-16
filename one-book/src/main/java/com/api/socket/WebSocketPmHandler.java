package com.api.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * <p>
 * webSocket处理器
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年03月27日)
 * @version 1.0
 * @fileName WebSocketHandler.java
 */
public class WebSocketPmHandler extends TextWebSocketHandler {

    private static Logger logger = LoggerFactory.getLogger(WebSocketPmHandler.class);
    //存放所有新加入的连接
    public static final Map<String, WebSocketUserGroupDto> userGroup = new ConcurrentHashMap<String, WebSocketUserGroupDto>();
    //存放根据场次分组后的用户连接
    public static final Map<String, CopyOnWriteArrayList<WebSocketUserGroupDto>> auctionGroup = new HashMap<String, CopyOnWriteArrayList<WebSocketUserGroupDto>>();
    //记录连接人数
    public int peopleNumber = 0;

    /**
     * 新连接加入时，调用此方法
     *
     * @param session
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        Object objAuc = session.getAttributes().get("auctionId");
        Object objApp = session.getAttributes().get("appOrigin");
        String app="",auctionId="";
        if(objAuc != null && objApp != null){
            auctionId = objAuc.toString();//场次id
            app = objApp.toString();//app来源
        }
        WebSocketUserGroupDto userGroupDto = new WebSocketUserGroupDto(app, auctionId, session);//存储用户
        if(auctionGroup.get(auctionId) instanceof List){//如果该场次ID下已经有用户list，则把新用户存放至该场次下
            auctionGroup.get(auctionId).add(userGroupDto);
        }else{//如果当前场次第一次加入用户，则新建list并存放用户信息
            CopyOnWriteArrayList<WebSocketUserGroupDto> users = new CopyOnWriteArrayList<WebSocketUserGroupDto>();
            users.add(userGroupDto);
            auctionGroup.put(auctionId,users);
        }
        userGroup.put(session.getId(), userGroupDto);
        peopleNumberPlusCalculation();
        logger.info("当前连接人数。。。。PM：" + peopleNumber);
        logger.info("有新用户加入到websocket中，APPORIGIN：" + session.getAttributes().toString());
    }

    /**
     * 处理前端发送的消息
     *
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        logger.info("收到前台用户推送的消息。。。消息内容：" + message.getPayload());
        EventMessage eventMessage = new EventMessage<String>();//测试前台发送消息
        eventMessage.setEvent("paimai_price");
        eventMessage.setMessage(message.getPayload());
        WebSocketMq2Topic.es.execute(new WebSocketSendMessage(eventMessage));
    }

    /**
     * 连接关闭时，调用此方法
     *
     * @param session
     * @param status
     * @throws Exception
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        removeUserSession(session);
        peopleNumberLessCalculation();
        logger.info("当前连接人数。。。。：" + peopleNumber);
        logger.info("有用户退出websocket，APPORIGIN：" + session.getAttributes().get("appOrigin"));
        super.afterConnectionClosed(session, status);
    }

    /**
     * 传输错误时被调用
     *
     * @param session
     * @param exception
     * @throws Exception
     */
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if (session.isOpen()) {
            session.close();
        }
        removeUserSession(session);
        peopleNumberLessCalculation();
        logger.info("发生连接错误。。。，wsSessionID：" + session.getId());
    }

    /**
     * 移除断开连接的用户
     * @param session
     */
    private void removeUserSession(WebSocketSession session){
        logger.info("WebSocketSessionID======================"+session.getId());
        logger.info("WebSocketSessionAuctionId======================"+session.getAttributes().get("auctionId"));
        userGroup.remove(session.getId());
        Object obj = session.getAttributes().get("auctionId");
        if(obj != null){
            String auctionId = obj.toString();//场次id
            if(auctionGroup.get(auctionId) instanceof List){
                List<WebSocketUserGroupDto> groupDtos = auctionGroup.get(auctionId);
                for(WebSocketUserGroupDto dto:groupDtos){
                    if(dto.getWebSocketSession().getId().equals(session.getId()))
                        groupDtos.remove(dto);
                }
            }
        }
    }

    /**
     * 记录连接人数
     */
    public synchronized void peopleNumberLessCalculation() {
        if (peopleNumber > 0) {
            peopleNumber--;
        }
    }

    /**
     * 记录连接人数
     */
    public synchronized void peopleNumberPlusCalculation() {
        peopleNumber++;
    }
}
