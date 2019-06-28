package com.mongo.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "time")
public class Time {
    private int startTime, endTime, totaltables, freeTables;
    private String id;
    List<String> userId;

    public Time(int startTime, int endTime, int totaltables, int freeTables, String id, List<String> userId) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.totaltables = totaltables;
        this.freeTables = freeTables;
        this.id = id;
        this.userId = new ArrayList<String>(userId);
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getTotaltables() {
        return totaltables;
    }

    public void setTotaltables(int totaltables) {
        this.totaltables = totaltables;
    }

    public int getFreeTables() {
        return freeTables;
    }

    public void setFreeTables(int freeTables) {
        this.freeTables = freeTables;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getUserId() {
        return userId;
    }

    public void setUserid(List<String> userId) {
        this.userId = new ArrayList<String>(userId);
    }
}
