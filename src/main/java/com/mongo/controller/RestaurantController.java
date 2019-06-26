package com.mongo.controller;

import com.mongo.repository.RestaurantRepository;
import com.mongo.document.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
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

    @RequestMapping("/tables")
    public List<Boolean> availableTables() {
        List<Table> tables = restRepository.findAll();
        List<Boolean> available = new ArrayList<Boolean>(Arrays.asList(false,false,false,false,false,false,false,false,false,false));

        for(int i = 0; i<10; i++) {

            for(int j=0; j<10; j++) {
                if (tables.get(j).getBooked().get(i) == false) {
                    available.set(i, true);
                    break;
                }
            }
        }

        return available;
    }

}
