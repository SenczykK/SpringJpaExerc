package com.example1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.entity.A;
import com.example1.entity.Aa;
import com.example1.entity.Bb;
import com.example1.entity.Bbb;

public interface BbbRepository extends JpaRepository<Bbb, Long> {

}
