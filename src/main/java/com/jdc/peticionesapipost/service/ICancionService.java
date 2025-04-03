package com.jdc.peticionesapipost.service;

import com.jdc.peticionesapipost.dto.CancionDTO;
import com.jdc.peticionesapipost.models.CancionEntity;

public interface ICancionService {
    public CancionEntity save(CancionDTO cancionDTO);
}
