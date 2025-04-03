package com.jdc.peticionesapipost.service;

import com.jdc.peticionesapipost.models.GeneroEntity;

import java.util.List;

public interface IGeneroService {
    public void save(GeneroEntity genero);
    public GeneroEntity findById(Long id);
    public List<GeneroEntity> findAll();
    public void delete(Long id);
}
