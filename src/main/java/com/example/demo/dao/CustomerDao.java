package com.example.demo.dao;

import com.example.demo.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerDao extends MongoRepository<Customer, Integer> {
}
