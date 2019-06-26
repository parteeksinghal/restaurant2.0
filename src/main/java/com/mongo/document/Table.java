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
    private String userid;



    public Table(String id, List<Boolean> booked, String userid) {
        this.id = id;
        this.booked = new ArrayList<Boolean>(booked);
        this.userid = userid;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
