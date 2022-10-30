package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.dto.OrderCurrencyExchangeDTO;
import com.gardhagen.WigellkoncernenCarRental.models.Rent;
import com.gardhagen.WigellkoncernenCarRental.repository.CarRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import com.gardhagen.WigellkoncernenCarRental.repository.RentRepository;
import com.gardhagen.WigellkoncernenCarRental.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1")
public class RentController {

    @Autowired
    private RentService rentService;
    @Autowired
    public RentController(RentService rentService){this.rentService = rentService;}

    @GetMapping("/myorders")
    public List<Rent> getAllRents(){return rentService.getAllRents();}
    @PostMapping("/ordercar")
    public ResponseEntity<Rent> addRent(@RequestBody Rent rent){
        return new ResponseEntity<Rent>(rentService.addRent(rent), HttpStatus.CREATED);
    }
    @PutMapping("/cancelorder/{id}")
    public ResponseEntity<Rent> canscelOrder(@PathVariable("id")long id,@RequestBody Rent rent){
        return new ResponseEntity<Rent>(rentService.updateRent(rent,id),HttpStatus.OK);
    }

    @PutMapping("/updateorder/{id}")
    public ResponseEntity<Rent> updateRent(@PathVariable("id")long id,@RequestBody Rent rent){
        return new ResponseEntity<Rent>(rentService.updateRent(rent,id),HttpStatus.OK);
    }
    @GetMapping("/exchange")
    public List<OrderCurrencyExchangeDTO> getTotalPriceExchanged(){ return rentService.getTotalPriceExchanged();}
}
