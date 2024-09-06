package com.projectspring.course.services;

import com.projectspring.course.entities.Order;

import com.projectspring.course.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// component registration para registrar como um component;
@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
