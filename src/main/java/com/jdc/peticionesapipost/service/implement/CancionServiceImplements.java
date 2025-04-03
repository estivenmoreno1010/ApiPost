package com.jdc.peticionesapipost.service.implement;

import com.jdc.peticionesapipost.dto.CancionDTO;
import com.jdc.peticionesapipost.models.CancionEntity;
import com.jdc.peticionesapipost.models.GeneroEntity;
import com.jdc.peticionesapipost.repository.CancionRepository;
import com.jdc.peticionesapipost.repository.GeneroRepository;
import com.jdc.peticionesapipost.service.IArtistaService;
import com.jdc.peticionesapipost.service.ICancionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CancionServiceImplements implements ICancionService {

    @Autowired
    private CancionRepository cancionRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    @Transactional
    public CancionEntity save(CancionDTO cancionDTO) {
        CancionEntity cancion = new CancionEntity();
        //Mapear el DTO a la entidad
        cancion.setNombre(cancionDTO.getNombre());
        cancion.setFechalanzamiento(cancionDTO.getFechalanzamiento());
        cancion.setDuracion(cancionDTO.getDuracion());
        cancion.setAlbum(cancionDTO.getAlbum());
        //Asignar la entidad de genero usando el id proporcionado
        GeneroEntity genero = generoRepository.findById(cancionDTO.getFkgenero())
                .orElseThrow(()-> new RuntimeException("Genero no encontrado"));
        cancion.setGenero(genero);
        return cancionRepository.save(cancion);
    }
}
