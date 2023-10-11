package com.restaurant.controller;

import com.restaurant.persistence.entity.CustomerOrder;
import com.restaurant.services.interfaces.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public CustomerOrder save(@RequestBody CustomerOrder order) {return orderService.save(order);
    }

    @GetMapping
    public List<CustomerOrder> findAll() {
        return orderService.findAll();
    }

}
