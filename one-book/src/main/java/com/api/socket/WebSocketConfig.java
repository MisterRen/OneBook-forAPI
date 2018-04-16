package com.api.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * <p>
 * Spring WebSocket的配置
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年03月27日)
 * @version 1.0
 * @fileName WebSocketConfig.java
 */
//@EnableWebMvc//这个标注可以不加，如果有加，要extends WebMvcConfigurerAdapter
@Configuration
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

    private static Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);

    /*@Autowired
    private WebSocketHandler webSocketHandler;*/

    /*@Autowired
    private ConsumerProvider consumerProvider;*/

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        //注册PM websocket
        webSocketHandlerRegistry.
                addHandler(webSocketHandler(), WebSocketConstant.WEB_SOCKET_PM_URL).
                addInterceptors(new WebSocketHandshakeInterceptor()).setAllowedOrigins("/ws/web/pm");
        //注册竞价，如需注册，请根据业务需求重写TextWebSocketHandler,并把handler传入
        webSocketHandlerRegistry.
                addHandler(webSocketPmHandler(),"/ws/web/jj").
                addInterceptors(new WebSocketHandshakeInterceptor()).setAllowedOrigins("/ws/web/jj");

        //注册socketJS，提供SocketJS支持
        webSocketHandlerRegistry.
                addHandler(webSocketHandler(), WebSocketConstant.SOCKET_JS_URL).
                addInterceptors(new WebSocketHandshakeInterceptor()).withSockJS();

        logger.info("=============================注册ws================================");
    }

    @Bean
    public TextWebSocketHandler webSocketHandler() {
        return new WebSocketHandler();
    }

    @Bean
    public TextWebSocketHandler webSocketPmHandler() {
        return new WebSocketPmHandler();
    }
}
