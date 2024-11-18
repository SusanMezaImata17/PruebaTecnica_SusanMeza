package com.practica.bus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.practica.bus.dto.BusDTO;
import com.practica.bus.model.Bus;
import com.practica.bus.repository.BusRepository;



@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;  

    @Autowired
    private BusMapper busMapper; 

    public Bus getBus(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus not found with id " + id));
    }

    public BusDTO toBusDTO(Bus bus) {
        return busMapper.toBusDTO(bus);
    }
    


    public Page<BusDTO> getAllBuses(Pageable pageable) {
    
        Page<Bus> busPage = busRepository.findAll(pageable);

       
        return busPage.map(busMapper::toBusDTO);
    }
}
