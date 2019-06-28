package com.mongo.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")
public class User {
    private String id;
    private String name;
    private String mobile;
    private String timeSlot;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }


    public User() {

    }
    public User(String id, String name, String mobile, String timeSlot) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.timeSlot = timeSlot;
    }

    public User(String name, String mobile, String timeSlot) {
        this.name = name;
        this.mobile = mobile;
        this.timeSlot = timeSlot;
    }
}
