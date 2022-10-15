package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.exception.ResourceNotFoundException;
import com.gardhagen.WigellkoncernenCarRental.models.Car;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService implements CarServiceInterface{
    @Autowired
    private CarRepository carRepository;


//    @Autowired
//    public CarService(CarRepository carRepository){this.carRepository = carRepository;}

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(long id) {
        return null;
    }

    @Override
    public Car updateCar(Car car, long id) {
        Car c =carRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Car","Id",id));
        c.setBrand(car.getBrand());
        c.setColor(car.getColor());
        c.setFuelType(car.getFuelType());
        c.setModelYear(car.getModelYear());
        carRepository.save(c);
        return c;
    }

    @Override
    public void deleteCar(long id) {
        carRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Car","id",id));
        carRepository.deleteById(id);
    }

}
