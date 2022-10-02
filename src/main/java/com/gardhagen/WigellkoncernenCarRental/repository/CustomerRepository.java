package com.gardhagen.WigellkoncernenCarRental.repository;

import com.gardhagen.WigellkoncernenCarRental.models.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
