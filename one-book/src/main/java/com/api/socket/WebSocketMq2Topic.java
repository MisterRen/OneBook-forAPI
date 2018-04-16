package com.api.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * <p>
 * 接收MQ消息，推送给前台用户
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年03月29日)
 * @version 1.0
 * @fileName WebSocketMq.java
 */
@Component
public class WebSocketMq2Topic /*implements MessageProcessor<EventMessage<String>>*/ {

    private static Logger logger = LoggerFactory.getLogger(WebSocketMq2Topic.class);

    //public static ExecutorService es = Executors.newFixedThreadPool(30);
    public static ExecutorService es = Executors.newSingleThreadExecutor();
    //public static ExecutorService es = Executors.newCachedThreadPool();

    /*public static ThreadPoolExecutor es;
    static {
        es = new ThreadPoolExecutor(10,30,200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
    }*/

    /*@Autowired
    private ConsumerProvider consumerProvider;

    @PostConstruct
    public void initTopic() {
        logger.info("=============================启动订阅MQ================================");
        consumerProvider.startTopic(this, WebSocketConstant.MQ_TOPIC_QUEUE);
    }

    // todo 点对点MQ，如有需要，可自行开启
    *//*@PostConstruct
    public void initP2P() {
        logger.info("=============================启动点对点MQ================================");
        consumerProvider.startP2P(this,WebSocketConstant.MQ_P2P_QUEUE);
    }*//*

    @Override
    public void doProcess(EventMessage message) {
        logger.info("================收到MQ消息================");
        logger.info("消息体："+message.getMessage());
        es.execute(new WebSocketSendMessage(message));
        logger.info("================推送MQ消息================");
        *//*webSocketHandler.sendMessageToAll(new TextMessage(message.getMessage().toString()));*//*
        //new Thread(new WebSocketSendMessage(new TextMessage(message.getMessage().toString()))).start();
    }*/

}
