package com.restaurant.services.interfaces;

import com.restaurant.persistence.entity.CustomerOrder;

import java.util.List;

public interface OrderService {

    CustomerOrder save(CustomerOrder order);
    List<CustomerOrder> findAll();

}
