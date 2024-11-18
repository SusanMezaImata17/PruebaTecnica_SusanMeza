package com.practica.bus.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marca_id")  
    private Long marcaId;

    @Column(name = "nombre")
    private String nombre;

    
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
