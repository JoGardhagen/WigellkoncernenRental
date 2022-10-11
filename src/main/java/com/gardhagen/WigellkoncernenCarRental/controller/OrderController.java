package com.gardhagen.WigellkoncernenCarRental.controller;

import com.gardhagen.WigellkoncernenCarRental.models.orders.Order;
import com.gardhagen.WigellkoncernenCarRental.repository.OrderRepository;
import com.gardhagen.WigellkoncernenCarRental.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderService orderService;

    @GetMapping("api/v1/orders")
    public List<Order>getAllOrders(){return orderService.getAllOrders();}
    @PostMapping("api/v1/ordercar")
    public ResponseEntity<Order> orderCar(@RequestBody Order order){
        return new ResponseEntity<Order>(orderService.orderCar(order), HttpStatus.CREATED);
    }
}
