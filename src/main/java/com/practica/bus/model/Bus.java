package com.practica.bus.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bus")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bus_id")
    private Long id;

    @Column(name = "numero_bus", nullable = false)
    private String numeroBus;

    @Column(nullable = false)
    private String placa;

    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    
    private LocalDateTime fechaCreacion;

    private String caracteristicas;

    @Column(nullable = false)
    private Boolean activo;

    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "marca_id", nullable = false)  // Aquí referenciamos marca_id correctamente
    private Marca marcaId; // El nombre de la propiedad corresponde a marcaId

    @PrePersist
    public void prePersist() {
        this.fechaCreacion = LocalDateTime.now();  // Establece la fecha y hora actual antes de persistir
    }

    // Getters y Setters
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

    public Marca getMarca() {  // Usamos getMarca() para acceder a la marca relacionada
        return marcaId;
    }

    public void setMarca(Marca marca) {  // Usamos setMarca() para asignar una marca
        this.marcaId = marca;
    }
    
    
}