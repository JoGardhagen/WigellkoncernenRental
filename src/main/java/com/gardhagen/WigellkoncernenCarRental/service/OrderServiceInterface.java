package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.models.orders.Order;

import java.util.List;

public interface OrderServiceInterface {
    Order orderCar(Order order);
    List<Order>getAllOrders();
    Order updateOrder(Order order,long id);
    void deleteOrder(long id);
}
