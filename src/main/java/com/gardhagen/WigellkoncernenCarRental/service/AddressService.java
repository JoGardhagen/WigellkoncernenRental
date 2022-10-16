package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.exception.ResourceNotFoundException;
import com.gardhagen.WigellkoncernenCarRental.models.Address;
import com.gardhagen.WigellkoncernenCarRental.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
public class AddressService implements AddressServiceInterface{
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(long id) {
        return null;
    }

    @Override
    public Address updateAddress(Address address, long id) {
        return null;
    }

    @Override
    public void deleteDelete(long id) {
        addressRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Address","id",id));
        addressRepository.deleteById(id);
    }
}
