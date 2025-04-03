package com.jdc.peticionesapipost.repository;

import com.jdc.peticionesapipost.models.CancionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancionRepository extends JpaRepository<CancionEntity, Long> {
}
