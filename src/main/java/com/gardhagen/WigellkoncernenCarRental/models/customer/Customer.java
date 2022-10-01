package com.gardhagen.WigellkoncernenCarRental.models.customer;

import com.gardhagen.WigellkoncernenCarRental.models.Person;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Customer extends Person {


    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, int age, String email) {
        super(id, firstName, lastName, age, email);
    }

}
