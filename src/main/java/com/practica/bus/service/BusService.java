package com.practica.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.practica.bus.dto.BusDTO;
import com.practica.bus.model.Bus;
import com.practica.bus.repository.BusRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;  // Repositorio de Bus

    @Autowired
    private BusMapper busMapper;  // Mapper para convertir de Bus a BusDTO

    public Bus getBus(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus not found with id " + id));
    }

    public BusDTO toBusDTO(Bus bus) {
        return busMapper.toBusDTO(bus);
    }
    
    
 // **Nuevo método**: Obtener todos los buses registrados
 // Método con paginación
    public Page<BusDTO> getAllBuses(Pageable pageable) {
        // Recuperar una página de buses de la base de datos
        Page<Bus> busPage = busRepository.findAll(pageable);

        // Convertir la página de Bus a una página de BusDTO
        return busPage.map(busMapper::toBusDTO);
    }
}
