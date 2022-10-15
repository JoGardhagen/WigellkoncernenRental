package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.models.Rent;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.RentRepository;
import com.gardhagen.WigellkoncernenCarRental.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//@RestController
public class RentController {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RentRepository rentRepository;
    @Autowired
    private RentService rentService;
    @Autowired
    public RentController(RentService rentService){this.rentService = rentService;}

    @GetMapping("api/v1/rentals")
    public List<Rent> getAllRents(){return rentService.getAllRents();}
    @PostMapping("api/v1/ordercar")
    public ResponseEntity<Rent> addRent(@RequestBody Rent rent){
        return new ResponseEntity<Rent>(rentService.addRent(rent), HttpStatus.CREATED);
    }
}
