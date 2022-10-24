package com.gardhagen.WigellkoncernenCarRental.models;

import com.gardhagen.WigellkoncernenCarRental.models.Car;
import com.gardhagen.WigellkoncernenCarRental.models.Customer;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
public class Rent {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    private long id;

    @ManyToOne(fetch = FetchType.EAGER ,optional = false)
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(fetch = FetchType.EAGER ,optional = false)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private String rentalDate;


    public Rent() {
    }

    public Rent(Car car, Customer customer, String rentalDate) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;

    }

    public Rent(long id, Car car, Customer customer, String rentalDate) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;
    }

    public String getRentalDate() {
        return LocalDateTime.now().toString();
    }

    public void setRentalDate(String rentalDate) {
        this.rentalDate = LocalDate.now().toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
