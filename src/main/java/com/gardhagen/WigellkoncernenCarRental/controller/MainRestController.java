package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.models.Car;
import com.gardhagen.WigellkoncernenCarRental.models.Customer;
import com.gardhagen.WigellkoncernenCarRental.models.Rent;
import com.gardhagen.WigellkoncernenCarRental.service.CarService;
import com.gardhagen.WigellkoncernenCarRental.service.CustomerService;
import com.gardhagen.WigellkoncernenCarRental.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class MainRestController {
//    @Autowired
//    private CustomerRepository customerRepository;
//    @Autowired
//    private CarRepository carRepository;
//    @Autowired
//    private RentRepository rentRepository;

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CarService carService;
    @Autowired
    private RentService rentService;

    ///////////////Automobile mapping///////////////

//    @Autowired
//    public CarController(CarService carService){this.carService = carService;}

    @GetMapping("api/v1/cars")
    public List<Car> getCar(){return carService.getAllCars();}

    @PostMapping("api/v1/addcar")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        return new ResponseEntity<Car>(carService.addCar(car), HttpStatus.CREATED);
    }
    @PutMapping("api/v1/updatecar/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable("id")long id,@RequestBody Car car){
        return new ResponseEntity<Car>(carService.updateCar(car,id),HttpStatus.OK);
    }
    @DeleteMapping("api/v1/deletecar/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id")long id){
        carService.deleteCar(id);
        return new ResponseEntity<String>("Car Deleted",HttpStatus.OK);
    }
    //////////////////////Customer mapping//////////////////////////
//    @Autowired
//    public CustomerController(CustomerService customerService){this.customerService = customerService;}

    @GetMapping("api/v1/customers")
    public List<Customer> getCustomer(){return customerService.getAllCustomer();}

    @PostMapping("api/v1/addcustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

    ////////////////////Rent mapping/////////////////////////////////
    @GetMapping("api/v1/rentals")
    public List<Rent> getAllRents(){return rentService.getAllRents();}
    @PostMapping("api/v1/ordercar")
    public ResponseEntity<Rent> addRent(@RequestBody Rent rent){
        return new ResponseEntity<Rent>(rentService.addRent(rent), HttpStatus.CREATED);
    }
}
