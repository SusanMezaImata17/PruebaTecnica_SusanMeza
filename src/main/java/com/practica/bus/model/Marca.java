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
    @Column(name = "marca_id")  // Nombre correcto de la columna
    private Long marcaId;

    @Column(name = "nombre")
    private String nombre;

    // Getters y Setters
    public Long getMarcaId() {  // Método getter corregido
        return marcaId;
    }

    public void setMarcaId(Long marcaId) {  // Método setter corregido
        this.marcaId = marcaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
