package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.Address;
import com.gardhagen.WigellkoncernenCarRental.models.Car;

import java.util.List;

public interface AddressServiceInterface {
    Address addAddress(Address address);
    List<Address> getAllAddresses();
    Address getAddressById(long id);
    Address updateAddress(Address address ,long id);
    void deleteDelete(long id);


}
