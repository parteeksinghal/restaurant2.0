package com.mongo.repository;

import com.mongo.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findOneByMobile(String mobile);
}
