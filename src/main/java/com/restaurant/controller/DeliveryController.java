package com.restaurant.controller;


import com.restaurant.persistence.entity.Delivery;
import com.restaurant.services.interfaces.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deliveries")
@RequiredArgsConstructor
public class DeliveryController {
    private final DeliveryService deliveryService;

    @PostMapping
    public Delivery save(@RequestBody Delivery delivery) {
        return deliveryService.save(delivery);
    }

    @GetMapping
    public List<Delivery> findAll() {
        return deliveryService.findAll();
    }

}
