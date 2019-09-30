package com.example1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.entity.A;
import com.example1.entity.Aa;

public interface AaRepository extends JpaRepository<Aa, Long> {

}
