package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.order.Rent;

import java.util.List;

public interface RentServiceInterface {
    Rent addRent(Rent rent);
    List<Rent> getAllRents();
    Rent getRentById(long id);
    Rent updateRent(Rent rent,long id);
    void deleteRent(long id);
}
