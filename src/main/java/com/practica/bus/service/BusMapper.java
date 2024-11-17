package com.practica.bus.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.practica.bus.dto.BusDTO;
import com.practica.bus.dto.MarcaDTO;
import com.practica.bus.model.Bus;

@Service
public class BusMapper {
	
	public BusDTO toBusDTO(Bus bus) {
        // Aquí cambiamos de getMarcaId() a getMarca() para acceder al objeto Marca completo
        MarcaDTO marcaDTO = new MarcaDTO(bus.getMarca().getMarcaId(), bus.getMarca().getNombre());
        return new BusDTO(
            bus.getId(),
            bus.getNumeroBus(),
            bus.getPlaca(),
            bus.getFechaCreacion(),
            bus.getCaracteristicas(),
            bus.getActivo(),
            marcaDTO
        );
    }

    public List<BusDTO> toBusDTOList(List<Bus> buses) {
        return buses.stream()
                    .map(this::toBusDTO)
                    .collect(Collectors.toList());
    }
}
