package com.practica.bus.dto;

import java.time.LocalDateTime;

public class BusDTO {
    private Long id;
    private String numeroBus;
    private String placa;
    private LocalDateTime fechaCreacion;
    private String caracteristicas;
    private Boolean activo;
    private MarcaDTO marca;

    
    public BusDTO(Long id, String numeroBus, String placa, LocalDateTime fechaCreacion, String caracteristicas, Boolean activo, MarcaDTO marca) {
        this.id = id;
        this.numeroBus = numeroBus;
        this.placa = placa;
        this.fechaCreacion = fechaCreacion;
        this.caracteristicas = caracteristicas;
        this.activo = activo;
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(String numeroBus) {
        this.numeroBus = numeroBus;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public MarcaDTO getMarca() {
        return marca;
    }

    public void setMarca(MarcaDTO marca) {
        this.marca = marca;
    }
}