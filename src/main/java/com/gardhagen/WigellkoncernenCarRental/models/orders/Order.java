package com.gardhagen.WigellkoncernenCarRental.models.orders;

import com.gardhagen.WigellkoncernenCarRental.models.cars.Car;
import com.gardhagen.WigellkoncernenCarRental.models.customer.Customer;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Order")
public class Order {
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
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

//    @CreationTimestamp
//    @Column(name = "create_date")
//    private Date createDate;

    public Order() {
    }

    public Order(long id, Car car, Customer customer) {
        this.id = id;
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
