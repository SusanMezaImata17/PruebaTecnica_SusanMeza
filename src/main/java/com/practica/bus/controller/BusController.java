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
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

   
    @GetMapping("/{id}")
    public ResponseEntity<BusDTO> getBus(@PathVariable Long id) {
       
        Bus bus = busService.getBus(id);
        return ResponseEntity.ok(busService.toBusDTO(bus));
    }
    
    
    @GetMapping
    public ResponseEntity<Page<BusDTO>> getAllBuses(
            @RequestParam(defaultValue = "0") int page,  
            @RequestParam(defaultValue = "10") int size 
    ) {
        Pageable pageable = PageRequest.of(page, size); 
        Page<BusDTO> buses = busService.getAllBuses(pageable);
        return ResponseEntity.ok(buses);
    }
}

