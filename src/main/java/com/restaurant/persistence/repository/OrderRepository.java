package com.restaurant.persistence.repository;

import com.restaurant.persistence.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <CustomerOrder, Long> {
}
