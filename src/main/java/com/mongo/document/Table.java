package com.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "table")
public class Table {

    @Id
    private String id;

    private List<Boolean> booked;
    private List<String> username;
    private List<String> mobile;



    public Table(String id, List<Boolean> booked,List<String> username,List<String> mobile ) {
        this.id = id;
        this.booked = new ArrayList<Boolean>(booked);
        this.username = new ArrayList<String>(username);
        this.mobile = new ArrayList<String>(mobile);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Boolean> getBooked() {
        return booked;
    }

    public void setBooked(List<Boolean> booked) {
        this.booked = booked;
    }

    public List<String> getUsername() {
        return username;
    }

    public void setUsername(List<String> username) {
        this.username = username;
    }

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }
}
