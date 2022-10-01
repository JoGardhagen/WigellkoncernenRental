package com.gardhagen.WigellkoncernenCarRental.models;

public class Customer extends Person{

    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, int age, String email) {
        super(id, firstName, lastName, age, email);
    }

}
