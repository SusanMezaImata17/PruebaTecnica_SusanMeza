package com.practica.bus.dto;

public class MarcaDTO {
    private Long marcaId;  
    private String nombre;

 
    public MarcaDTO(Long marcaId, String nombre) {
        this.marcaId = marcaId;
        this.nombre = nombre;
    }

    public Long getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Long marcaId) {
        this.marcaId = marcaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
