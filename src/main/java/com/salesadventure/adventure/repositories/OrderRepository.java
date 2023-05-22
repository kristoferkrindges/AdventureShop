package com.salesadventure.adventure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesadventure.adventure.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
