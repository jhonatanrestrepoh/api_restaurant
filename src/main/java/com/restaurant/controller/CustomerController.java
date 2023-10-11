package com.restaurant.controller;

import com.restaurant.persistence.entity.Customer;
import com.restaurant.services.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer){return customerService.save(customer);}

    @GetMapping
    public List<Customer> findAll(){return customerService.findAll();}

    @DeleteMapping
    public  void delete(@RequestParam Long id){customerService.delete(id);}
}
