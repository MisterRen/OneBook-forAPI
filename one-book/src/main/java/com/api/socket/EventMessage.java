package com.api.socket;

/**
 * <p>
 * <p>
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2018年04月10日)
 * @version 1.0
 * @fileName EventMessage.java
 */
public class EventMessage<T> {

    String event;
    T message;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
