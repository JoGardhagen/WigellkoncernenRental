package com.gardhagen.WigellkoncernenCarRental.repository;

import com.gardhagen.WigellkoncernenCarRental.models.cars.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
