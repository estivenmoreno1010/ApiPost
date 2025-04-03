package com.jdc.peticionesapipost.repository;

import com.jdc.peticionesapipost.models.ArtistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<ArtistaEntity, Long> {
}
