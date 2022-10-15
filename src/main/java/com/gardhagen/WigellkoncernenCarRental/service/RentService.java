package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.Rent;
import com.gardhagen.WigellkoncernenCarRental.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RentService implements RentServiceInterface{
    @Autowired
    private RentRepository rentRepository;

    @Override
    public Rent addRent(Rent rent) {
        return rentRepository.save(rent);
    }

    @Override
    public List<Rent> getAllRents() {
        return rentRepository.findAll();
    }

    @Override
    public Rent getRentById(long id) {
        return null;
    }

    @Override
    public Rent updateRent(Rent rent, long id) {
        return null;
    }

    @Override
    public void deleteRent(long id) {

    }
}
