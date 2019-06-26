package com.mongo.repository;

import com.mongo.document.Table;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.List;

public interface RestaurantRepository extends MongoRepository<Table, String> {
}
