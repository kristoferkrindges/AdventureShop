package com.salesadventure.adventure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesadventure.adventure.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
