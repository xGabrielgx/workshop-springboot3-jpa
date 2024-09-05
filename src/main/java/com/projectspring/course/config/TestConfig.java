package com.projectspring.course.config;


import com.projectspring.course.entities.User;
import com.projectspring.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

// classe de configuração para instânciar o banco de dados;
@Configuration
// especifica para perfil de test em application properties
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // associar uma instância do userRepository;
    @Autowired
    private UserRepository userRepository; // para fazer um objeto depender de outro


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "98888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "97777777", "123456");

        // cria uma lista e salva no banco de dados
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
