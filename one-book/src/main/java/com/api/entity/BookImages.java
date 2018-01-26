package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * <p>
 * <p>
 * </p>
 * <font size=0.25>Copyright (C) 2017 CheXiang. All Rights Reserved.</font>
 *
 * @author xinhe.REN (Create on:2017年12月08日)
 * @version 1.0
 * @fileName BookImages.java
 */
@Entity
public class BookImages {

    @Id
    @GeneratedValue
    private Integer id;
    private String small;
    private String large;
    private String medium;

    public BookImages() {
    }

    public BookImages(String small, String large, String medium) {
        this.small = small;
        this.large = large;
        this.medium = medium;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
}
