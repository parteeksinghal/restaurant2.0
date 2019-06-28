package com.mongo.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "time")
public class Time {
    private int startTime, endTime, totalTables, freeTables;
    private Integer id;
    List<String> userId;

    public Time(int startTime, int endTime, int totalTables, int freeTables, Integer id, List<String> userId) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalTables = totalTables;
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

    public int getTotalTables() {
        return totalTables;
    }

    public void setTotalTables(int totalTables) {
        this.totalTables = totalTables;
    }

    public int getFreeTables() {
        return freeTables;
    }

    public void setFreeTables(int freeTables) {
        this.freeTables = freeTables;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<String> getUserId() {
        return userId;
    }

    public void setUserid(List<String> userId) {
        this.userId = new ArrayList<String>(userId);
    }
}
