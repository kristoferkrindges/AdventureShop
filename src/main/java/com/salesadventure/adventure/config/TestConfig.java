package com.salesadventure.adventure.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.salesadventure.adventure.entities.User;
import com.salesadventure.adventure.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria", "maria@gmail.com", 
        "99999", "12345");

        User u2 = new User(null, "Jack", "jack@gmail.com", 
        "79999", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
