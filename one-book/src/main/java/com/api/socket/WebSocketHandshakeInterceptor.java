package com.api.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 * WebSocket握手拦截器
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年03月27日)
 * @version 1.0
 * @fileName WebSocketHandshakeInterceptor.java
 */
public class WebSocketHandshakeInterceptor implements HandshakeInterceptor {

    private static Logger logger = LoggerFactory.getLogger(WebSocketHandshakeInterceptor.class);

    @Override
    public boolean beforeHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> map) throws Exception {
        if (serverHttpRequest instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletServerHttpRequest = (ServletServerHttpRequest) serverHttpRequest;
            HttpSession session = servletServerHttpRequest.getServletRequest().getSession(false);
            HttpServletRequest request = servletServerHttpRequest.getServletRequest();
            //String origin = request.getParameter("appOrigin");
            Map param = request.getParameterMap();
            logger.info("socket传入参数========="+request.getParameter("appOrigin"));
            logger.info("socket传入参数========="+request.getParameter("auctionId"));
            Set keySet = param.entrySet();
            for(Iterator itr = keySet.iterator(); itr.hasNext();){//获取请求参数，放入到websocketSession的map中
                Map.Entry me = (Map.Entry)itr.next();
                String keyObj = (String)me.getKey();
                Object valObj = me.getValue();
                if(valObj instanceof String[]){
                    map.put(keyObj.toString(), ((String[])valObj)[0]);
                }else{
                    map.put(keyObj.toString(), valObj.toString());
                }
            }
            if (session != null) {
                logger.info("包装后的参数========="+map.toString());
            }else{
                logger.info("SESSION为空！！！！！！！！！！！！");
                logger.info("包装后的参数========="+map.toString());
            }
        }
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
        System.out.println("After Handshake");
    }
}
