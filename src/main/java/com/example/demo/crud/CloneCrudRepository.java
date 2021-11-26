package com.example.demo.crud;

import com.example.demo.modelo.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloneCrudRepository extends MongoRepository<User, Integer> {


}
