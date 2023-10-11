package com.restaurant.persistence.repository;

import com.restaurant.persistence.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long> {

}
