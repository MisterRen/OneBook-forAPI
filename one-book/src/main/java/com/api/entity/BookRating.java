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
 * @fileName BookRating.java
 */
@Entity
public class BookRating {

    @Id
    @GeneratedValue
    private Integer id;
    private int max;
    private int numRaters;
    private String average;
    private int min;

    public BookRating() {
    }

    public BookRating(int max, int numRaters, String average, int min) {
        this.max = max;
        this.numRaters = numRaters;
        this.average = average;
        this.min = min;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getNumRaters() {
        return numRaters;
    }

    public void setNumRaters(int numRaters) {
        this.numRaters = numRaters;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }
}
