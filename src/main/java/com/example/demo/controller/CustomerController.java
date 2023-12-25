package com.example.demo.controller;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerDao dao;

    public CustomerController(CustomerDao dao) {
        this.dao = dao;
    }

    @PostMapping
    public ResponseEntity<?>addCustomer(@RequestBody Customer customer){
        Customer cust = dao.save(customer);
        return ResponseEntity.ok(cust);
    }
    @GetMapping
    public ResponseEntity<?>getCustomer(){
        List<Customer> cust = dao.findAll();
        return ResponseEntity.ok(cust);
    }
}
