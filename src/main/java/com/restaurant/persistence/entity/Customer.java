package com.restaurant.persistence.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;


@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id", updatable = false, unique = true)
    @Hidden
    private Long customerId;
    @Schema(description = "Nombre", example = "Jhonatan")
    private String name;
    @Schema(description = "Correo", example = "Jhonatan@gmail.com")
    private String email;

    @Schema(description = "Fecha de nacimiento", example = "2000-10-11")
    private Date birthdate;

    @OneToMany(mappedBy="customer", fetch = FetchType.LAZY)
    @JsonManagedReference(value="customer")
    @Hidden
    private List<CustomerOrder> orders;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }
}
