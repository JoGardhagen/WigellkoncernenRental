package com.gardhagen.WigellkoncernenCarRental.models;

import javax.persistence.*;
import java.sql.Date;

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

    private int rentalDays;

    private Date bookingDate = new Date(System.currentTimeMillis());

    private boolean active;

    public Rent() {
    }

    public Rent(long id, Car car, Customer customer, int rentalDays, Date bookingDate, boolean active) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.bookingDate = bookingDate;
        this.active = active;
    }

    public Rent(long id, Car car, Customer customer, int rentalDays, Date bookingDate) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
        this.bookingDate = bookingDate;
    }

    public Rent(long id, Car car, Customer customer, Date bookingDate) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.bookingDate = bookingDate;
    }

    public Rent(Car car, Customer customer, Date bookingDate) {
        this.car = car;
        this.customer = customer;
        this.bookingDate = bookingDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
