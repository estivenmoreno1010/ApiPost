package com.jdc.peticionesapipost.service.implement;

import com.jdc.peticionesapipost.models.GeneroEntity;
import com.jdc.peticionesapipost.repository.GeneroRepository;
import com.jdc.peticionesapipost.service.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeneroServiceImplements implements IGeneroService {

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    @Transactional
    public void save(GeneroEntity genero) {
          generoRepository.save(genero);
    }

    @Override
    @Transactional(readOnly = true)
    public GeneroEntity findById(Long id) {
        return generoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<GeneroEntity> findAll() {
        return generoRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        generoRepository.deleteById(id);
    }
}
