package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.models.Customer;
import com.gardhagen.WigellkoncernenCarRental.service.CustomerService;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping(path = "api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerService customerService){this.customerService = customerService;}

    @GetMapping("api/v1/customers")
    public List<Customer> getCustomer(){return customerService.getAllCustomer();}

    @PostMapping("api/v1/addcustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }
}
