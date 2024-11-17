package com.practica.bus.repository;

import com.practica.bus.model.*;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface BusRepository extends JpaRepository<Bus, Long> {
    Optional<Bus> findById(Long busId);
}