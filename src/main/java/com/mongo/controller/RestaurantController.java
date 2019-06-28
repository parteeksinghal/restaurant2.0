package com.mongo.controller;

import com.mongo.document.*;
import com.mongo.repository.TimeRepository;
import com.mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/book")
    public List<Time> getTimeSlots() {
        return timeRepository.findAll();
    }
    @RequestMapping(value = "/available", method = RequestMethod.POST)
    public boolean checkSlotAvailable(@RequestBody Slot timeSlot) {
        Time currSlot =  timeRepository.findOneByStartTimeAndEndTime(timeSlot.startTime, timeSlot.endTime);
        if (currSlot.getFreeTables() > 0) {
            return true;
        }
        return false;

    }

    @RequestMapping(value = "/bookTable", method = RequestMethod.POST)
    public void bookTable(@RequestBody Booking info) {
        Time currSlot =  timeRepository.findOneByStartTimeAndEndTime(info.getStartTime(), info.getEndTime());
        currSlot.setFreeTables( currSlot.getFreeTables()-1 );

        User newUser = new User(info.getName(), info.getMobile(), info.getStartTime().toString() + " " + info.getEndTime().toString()) ;
        userRepository.save(newUser);

        String newUserId = userRepository.findOneByMobile(newUser.getMobile()).getId();

        currSlot.getUserId().add(newUserId);

        timeRepository.save(currSlot);

    }

}
