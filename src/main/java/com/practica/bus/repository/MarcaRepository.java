package com.practica.bus.repository;

import com.practica.bus.model.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
    Optional<Marca> findById(Long marcaId);
}