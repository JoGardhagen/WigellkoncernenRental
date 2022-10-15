package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.Customer;

import java.util.List;

public interface CustomerServiceInterface {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerById(long id);
    Customer updateCustomer(Customer customer,long id);
    void deleteCustomer(long id);
}
