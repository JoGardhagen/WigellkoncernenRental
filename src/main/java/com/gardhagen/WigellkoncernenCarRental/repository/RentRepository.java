package com.gardhagen.WigellkoncernenCarRental.repository;

import com.gardhagen.WigellkoncernenCarRental.models.order.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Long> {
}
