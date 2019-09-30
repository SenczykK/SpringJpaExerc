package com.example1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.entity.A;

public interface ARepository extends JpaRepository<A, Long> {

}
