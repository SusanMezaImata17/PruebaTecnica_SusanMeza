package com.practica.bus.controller;

import com.practica.bus.dto.BusDTO;
import com.practica.bus.model.Bus;
import com.practica.bus.service.BusService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    // Obtener un bus por ID
    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> getBus(@PathVariable Long id) {
        // Usamos el servicio para obtener el bus y mapearlo a BusDTO
        Bus bus = busService.getBus(id);
        return ResponseEntity.ok(busService.toBusDTO(bus));
    }
    
    // Obtener todos los buses con paginación
    @GetMapping
    public ResponseEntity<Page<BusDTO>> getAllBuses(
            @RequestParam(defaultValue = "0") int page,  // Página inicial
            @RequestParam(defaultValue = "10") int size // Tamaño de página
    ) {
        Pageable pageable = PageRequest.of(page, size); // Construcción del objeto Pageable
        Page<BusDTO> buses = busService.getAllBuses(pageable);
        return ResponseEntity.ok(buses);
    }
}

