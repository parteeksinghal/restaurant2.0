package com.mongo.document;

import java.util.List;

public class Booking {

    List<Integer> index;
    String name;
    String mobile;


    public List<Integer> getIndex() {
        return index;
    }

    public void setIndex(List<Integer> index) {
        this.index = index;
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

    public Booking(List<Integer> index, String name, String mobile) {
        this.index = index;
        this.name = name;
        this.mobile = mobile;
    }
}
