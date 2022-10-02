package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.cars.Car;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository){this.carRepository = carRepository;}

    public List<Car> getCars(){
        return carRepository.findAll();
    }

}
