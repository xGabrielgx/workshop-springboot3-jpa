package com.projectspring.course.services;

import com.projectspring.course.entities.User;
import com.projectspring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// component registration para registrar como um component;
@Service
public class UserService {

    // dependence de user repository
    // autowired para injeção de dependência
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
