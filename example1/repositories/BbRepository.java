package com.example1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.entity.A;
import com.example1.entity.Aa;
import com.example1.entity.Bb;

public interface BbRepository extends JpaRepository<Bb, Long> {

}
