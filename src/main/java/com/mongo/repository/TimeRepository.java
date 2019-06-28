package com.mongo.repository;

import com.mongo.document.Table;
import com.mongo.document.Time;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface TimeRepository extends MongoRepository<Time, Integer> {
    public List<Time> findByStartTimeAndEndTime (Integer startTime, Integer LastTime);

    public Time findOneByStartTimeAndEndTime (Integer startTime, Integer LastTime);
}
