package com.api.socket;

import org.springframework.web.socket.WebSocketSession;

import java.io.Serializable;

/**
 * <p>
 * socket用户
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年04月04日)
 * @version 1.0
 * @fileName WebSocketUserGroupDto.java
 */
public class WebSocketUserGroupDto implements Serializable {

    private String appGroup;//app来源
    private String auctionGroup;//用户分组
    private WebSocketSession webSocketSession;//用户socketSession

    public WebSocketUserGroupDto(String appGroup, String auctionGroup, WebSocketSession webSocketSession) {
        this.appGroup = appGroup;
        this.auctionGroup = auctionGroup;
        this.webSocketSession = webSocketSession;
    }

    public String getAppGroup() {
        return appGroup;
    }

    public void setAppGroup(String appGroup) {
        this.appGroup = appGroup;
    }

    public String getAuctionGroup() {
        return auctionGroup;
    }

    public void setAuctionGroup(String auctionGroup) {
        this.auctionGroup = auctionGroup;
    }

    public WebSocketSession getWebSocketSession() {
        return webSocketSession;
    }

    public void setWebSocketSession(WebSocketSession webSocketSession) {
        this.webSocketSession = webSocketSession;
    }
}
