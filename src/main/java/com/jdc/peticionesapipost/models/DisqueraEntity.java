package com.jdc.peticionesapipost.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "disquera")
public class DisqueraEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddisquera")
    private Long iddisquera;

    @NotNull
    @Column(name = "fechafundacion")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechafundacion;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "pais")
    private String pais;

    public Long getIddisquera() {
        return iddisquera;
    }

    public void setIddisquera(Long iddisquera) {
        this.iddisquera = iddisquera;
    }

    public Date getFechafundacion() {
        return fechafundacion;
    }

    public void setFechafundacion(Date fechafundacion) {
        this.fechafundacion = fechafundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
