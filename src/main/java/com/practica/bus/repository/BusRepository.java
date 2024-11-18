package com.practica.bus.repository;

import com.practica.bus.model.*;


import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;



public interface BusRepository extends JpaRepository<Bus, Long> {
    Optional<Bus> findById(Long busId);
}