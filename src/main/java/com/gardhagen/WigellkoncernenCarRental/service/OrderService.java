package com.gardhagen.WigellkoncernenCarRental.service;

import com.gardhagen.WigellkoncernenCarRental.exception.ResourceNotFoundException;
import com.gardhagen.WigellkoncernenCarRental.models.orders.Order;
import com.gardhagen.WigellkoncernenCarRental.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService implements OrderServiceInterface{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order orderCar(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrder(Order order, long id) {
        return null;
    }

    @Override
    public void deleteOrder(long id) {
        orderRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Order","id",id));
        orderRepository.deleteById(id);
    }
}
