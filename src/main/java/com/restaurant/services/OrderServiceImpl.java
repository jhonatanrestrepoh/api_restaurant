package com.restaurant.services;

import com.restaurant.persistence.entity.CustomerOrder;
import com.restaurant.persistence.repository.OrderRepository;
import com.restaurant.services.interfaces.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public CustomerOrder save(CustomerOrder order) {return orderRepository.save(order); }

    @Override
    public List<CustomerOrder> findAll() {
        return orderRepository.findAll();
    }
}
