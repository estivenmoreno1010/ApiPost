package com.jdc.peticionesapipost.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "telefonos")
public class TelefonoEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtelefono")
    private int idtelefono;

    @NotNull
    @Column(name = "numero", length = 255)
    private String numero;

    @NotNull
    @Column(name = "tipo", length = 255)
    private Integer tipo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fkartista", referencedColumnName = "idartista")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private ArtistaEntity artista;

    @JsonProperty("fkartista")
    public Long getIdartista() {
        return artista != null ? artista.getIdartista() : null;
    }

    public int getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(int idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public ArtistaEntity getArtista() {
        return artista;
    }

    public void setArtista(ArtistaEntity artista) {
        this.artista = artista;
    }
}
