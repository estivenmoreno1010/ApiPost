package com.jdc.peticionesapipost.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "generos")
public class GeneroEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idgenero")
    private Long idgenero;

    @NotNull
    @Column(name = "nombre", length = 255)
    private String nombre;

    @OneToOne(mappedBy = "genero", cascade = CascadeType.ALL)
    @JsonIgnore
    private CancionEntity cancion;

    public Long getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Long idgenero) {
        this.idgenero = idgenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CancionEntity getCancion() {
        return cancion;
    }

    public void setCancion(CancionEntity cancion) {
        this.cancion = cancion;
    }

}
