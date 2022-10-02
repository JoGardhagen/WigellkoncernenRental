package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.customer.Customer;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface CustomerServiceInterface {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerById(long id);
    Customer updateCustomer(Customer customer,long id);
    void deleteCustomer(long id);
}
