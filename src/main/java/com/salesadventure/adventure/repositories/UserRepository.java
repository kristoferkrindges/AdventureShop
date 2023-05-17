package com.salesadventure.adventure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesadventure.adventure.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
