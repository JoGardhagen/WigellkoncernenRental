package com.gardhagen.WigellkoncernenCarRental.repository;

import com.gardhagen.WigellkoncernenCarRental.models.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
