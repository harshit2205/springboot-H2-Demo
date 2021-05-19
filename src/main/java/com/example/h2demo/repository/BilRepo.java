package com.example.h2demo.repository;

import com.example.h2demo.entity.Billionaires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BilRepo extends JpaRepository<Billionaires, Integer> {
}
