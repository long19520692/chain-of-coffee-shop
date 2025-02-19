package com.app.coffee.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.coffee.entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, UUID> {
    
}
