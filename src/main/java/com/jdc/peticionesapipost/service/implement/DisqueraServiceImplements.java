package com.jdc.peticionesapipost.service.implement;

import com.jdc.peticionesapipost.models.DisqueraEntity;
import com.jdc.peticionesapipost.repository.DisqueraRepository;
import com.jdc.peticionesapipost.service.IDisqueraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DisqueraServiceImplements implements IDisqueraService {
    @Autowired
    private DisqueraRepository disqueraRepository;

    @Override
    @Transactional(readOnly = true)
    public DisqueraEntity findById(Long id) {
        return disqueraRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(DisqueraEntity disquera) {
        disqueraRepository.save(disquera);
    }
}
