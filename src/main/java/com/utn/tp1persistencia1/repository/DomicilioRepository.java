package com.utn.tp1persistencia1.repository;

import com.utn.tp1persistencia1.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio, Integer> {
}
