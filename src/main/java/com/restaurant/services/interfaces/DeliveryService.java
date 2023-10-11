package com.restaurant.services.interfaces;

import com.restaurant.persistence.entity.Delivery;

import java.util.List;

public interface DeliveryService {

    Delivery save(Delivery delivery);
    List<Delivery> findAll();



}
