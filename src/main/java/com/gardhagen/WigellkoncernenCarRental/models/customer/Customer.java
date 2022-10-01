package com.gardhagen.WigellkoncernenCarRental.models.customer;

import com.gardhagen.WigellkoncernenCarRental.models.Person;

import javax.persistence.*;

@Entity
@Table
public class Customer extends Person {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, int age, String email) {
        super( firstName, lastName, age, email);
    }
    public Customer( String firstName, String lastName, int age, String email) {
        super( firstName, lastName, age, email);
    }

}
