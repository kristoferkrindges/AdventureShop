package com.salesadventure.adventure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesadventure.adventure.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
