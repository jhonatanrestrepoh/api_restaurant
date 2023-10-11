package com.restaurant.services;

import com.restaurant.persistence.entity.Customer;
import com.restaurant.persistence.repository.CustomerRepository;
import com.restaurant.services.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        if (isCustomerAdult(customer)) {
            return customerRepository.save(customer);
        } else {
            throw new IllegalArgumentException("El cliente debe ser mayor de edad para registrarse.");
        }
    }
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void delete(long customerID) {
        customerRepository.deleteById(customerID);
    }


    private boolean isCustomerAdult(Customer customer) {
        if (customer.getBirthdate() == null) {
            return false;
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = customer.getBirthdate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        long age = ChronoUnit.YEARS.between(birthdate, currentDate);
        return age >= 18;
    }
}
