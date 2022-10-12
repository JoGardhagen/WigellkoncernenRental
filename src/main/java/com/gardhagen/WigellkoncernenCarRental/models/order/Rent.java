package com.gardhagen.WigellkoncernenCarRental.models.order;

import com.gardhagen.WigellkoncernenCarRental.models.cars.Car;
import com.gardhagen.WigellkoncernenCarRental.models.customer.Customer;

import javax.persistence.*;

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

    @OneToOne(targetEntity = Car.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "car_fk",referencedColumnName = "id")
    private Car car;

    @OneToOne(targetEntity = Customer.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_fk",referencedColumnName = "id")
    private Customer customer;

    public Rent() {
    }

    public Rent(long id, Car car, Customer customer) {
        this.id = id;
        this.car = car;
        this.customer = customer;
    }

    public Rent(Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
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
