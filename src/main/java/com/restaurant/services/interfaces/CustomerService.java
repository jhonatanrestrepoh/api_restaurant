package com.restaurant.services.interfaces;

import com.restaurant.persistence.entity.Customer;
import com.restaurant.persistence.entity.Delivery;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    List<Customer> findAll();

    void delete(long customerID);

}
