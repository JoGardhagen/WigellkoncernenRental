package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.customer.Customer;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements CustomerServiceInterface{
    @Autowired
    private CustomerRepository customerRepository;

//    @Autowired
//    public CustomerService(CustomerRepository customerRepository){this.customerRepository = customerRepository;}

    @Override
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(long id) {
        return null;
    }

    @Override
    public Customer updateCustomer(Customer customer, long id) {
        return null;
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.findById(id).orElseThrow(() ->new RuntimeException("Customer"));
    }
}
