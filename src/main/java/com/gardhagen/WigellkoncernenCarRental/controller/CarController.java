package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.models.cars.Car;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import com.gardhagen.WigellkoncernenCarRental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "api/v1/cars")
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private CarRepository carRepository;
//    @Autowired
//    public CarController(CarService carService){this.carService = carService;}

    @GetMapping("api/v1/cars")
    public List<Car>getCar(){return carService.getAllCars();}

    @PostMapping("api/v1/addcar")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        return new ResponseEntity<Car>(carService.addCar(car), HttpStatus.CREATED);
    }
    @DeleteMapping("api/v1/deletecar/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id")Long id){
        carService.deleteCar(id);
        return new ResponseEntity<String>("Car Deleted",HttpStatus.OK);
    }


}
