package com.mongo.document;

import java.util.List;

public class Booking {

    private String name;
    private String mobile;
    private Integer startTime;
    private Integer endTime;

    public Booking(String name, String mobile, Integer startTime, Integer endTime) {
        this.name = name;
        this.mobile = mobile;
        this.startTime = startTime;
        this.endTime = endTime;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
}
