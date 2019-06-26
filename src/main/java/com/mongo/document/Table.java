package com.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Table")
public class Table {

    @Id
    private String id;

    private boolean booked;
    private String userid;



    public Table(String id, boolean booked, String userid) {
        this.id = id;
        this.booked = booked;
        this.userid = userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }

    public String getId() {
        return id;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
