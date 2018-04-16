package com.api.socket;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>
 * 群发线程
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年04月03日)
 * @version 1.0
 * @fileName WebSocketSendMessage.java
 */
public class WebSocketSendMessage implements Runnable {

    private static Logger logger = LoggerFactory.getLogger(WebSocketSendMessage.class);

    private EventMessage eventMessage;

    private static final Gson gson = new Gson();

    private ReentrantLock reentrantLock = new ReentrantLock(true);

    public WebSocketSendMessage(EventMessage eventMessage) {
        this.eventMessage = eventMessage;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        logger.info("当前线程。。。。" + Thread.currentThread().getName());
        try {
            if(isJsonObject(eventMessage.getMessage().toString())){
                if ("paimai_price".equals(eventMessage.getEvent())) {//针对拍卖的消息推送线程
                    String msgStr = eventMessage.getMessage().toString();
                    TextMessage textMessage = new TextMessage(msgStr);//新建消息体
                    Map<String,String> msg = gson.fromJson(msgStr, new TypeToken<Map<String, String>>() {}.getType());//反序列化
                    String auctionId = msg.get("auctionId");//获取场次ID用于判断
                    List<WebSocketUserGroupDto> auctionUsers = WebSocketHandler.auctionGroup.get(auctionId);//获取场次下的socket用户
                    if(!auctionUsers.isEmpty()){
                        for (WebSocketUserGroupDto dto : auctionUsers){
                            dto.getWebSocketSession().sendMessage(textMessage);//推送消息
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    /**
     * 判断消息体是否是JSON,比较LOWB的写法
     * @param json
     * @return
     */
    public static boolean isJsonObject(String json){
        try {
            gson.fromJson(json, new TypeToken<Map<String, String>>() {}.getType());
            return true;
        } catch (Exception e) {
            //e.printStackTrace();
            logger.error("【"+json+"】JSON转换异常===="+e.getMessage());
            return false;
        }
    }
}
