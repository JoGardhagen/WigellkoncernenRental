package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.cars.Car;

import java.util.List;

public interface CarServiceInterface {
    Car addCar(Car car);
    List<Car> getAllCars();
    Car getCarById(long id);
    Car updateCar(Car car ,long id);
    void deleteCar(long id);
}
