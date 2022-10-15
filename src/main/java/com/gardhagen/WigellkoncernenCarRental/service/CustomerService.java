package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.dto.CustomerAddressDTO;
import com.gardhagen.WigellkoncernenCarRental.models.Customer;
import com.gardhagen.WigellkoncernenCarRental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<CustomerAddressDTO> getAllCustomerInfo(){
        return customerRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());

    }
    private CustomerAddressDTO convertEntityToDto(Customer customer){
        CustomerAddressDTO customerAddressDTO = new CustomerAddressDTO();
        customerAddressDTO.setUserId(customer.getId());
        customerAddressDTO.setUserName(customer.getFirstName()+"_"+customer.getFirstName());
        customerAddressDTO.setEmail(customer.getEmail());
        customerAddressDTO.setPlace(customer.getAddress().getLocationName());
        customerAddressDTO.setPostalNr(customer.getAddress().getPostalNr());
        return customerAddressDTO;
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
