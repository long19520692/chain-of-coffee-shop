package com.app.coffee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.coffee.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID>{
    
}
