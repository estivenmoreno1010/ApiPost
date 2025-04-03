package com.jdc.peticionesapipost.repository;

import com.jdc.peticionesapipost.models.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GeneroRepository extends JpaRepository<GeneroEntity, Long> {
    @Modifying
    @Query("DELETE FROM GeneroEntity  g WHERE g.idgenero =?1")
    public void deleteById(Long idgenero);
}
