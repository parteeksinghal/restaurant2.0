package com.mongo.controller;

import com.mongo.repository.RestaurantRepository;
import com.mongo.document.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantRepository restRepository;

    @RequestMapping("/allTables")
    public List<Table> getTables() {
        return restRepository.findAll();
    }

    @RequestMapping("/test")
    public String test() {
        return "Working!";
    }

}
