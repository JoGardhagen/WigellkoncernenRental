package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.models.Address;
import com.gardhagen.WigellkoncernenCarRental.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("api/v1/addresses")
    public List<Address> getAllAddresses(){return addressService.getAllAddresses();}

    @PostMapping("api/v1/addaddress")
    public ResponseEntity<Address> aaddAddress(@RequestBody Address address){
        return new ResponseEntity<Address>(addressService.addAddress(address), HttpStatus.CREATED);
    }
    @DeleteMapping("api/v1/deleteadress/{id}")
    public ResponseEntity<String> deleteDelete(@PathVariable("id")Long id){
        addressService.deleteDelete(id);
        return new ResponseEntity<String>("Address Deleted",HttpStatus.OK);
    }
}
