package com.jdc.peticionesapipost.service;

import com.jdc.peticionesapipost.models.DisqueraEntity;

public interface IDisqueraService {
    public DisqueraEntity findById(Long id);
    public void save(DisqueraEntity disquera);

}
