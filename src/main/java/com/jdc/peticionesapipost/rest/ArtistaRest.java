package com.jdc.peticionesapipost.rest;

import com.jdc.peticionesapipost.dto.ArtistaDTO;
import com.jdc.peticionesapipost.models.ArtistaEntity;
import com.jdc.peticionesapipost.service.IArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/artista")
public class ArtistaRest {

    @Autowired
    private IArtistaService artistaService;

    @PostMapping("/crear")
    public ResponseEntity<ArtistaEntity> crear(
            @RequestBody ArtistaDTO artistaDTO
    ){
        try {
            ArtistaEntity miartista = artistaService.save(artistaDTO);
            ResponseEntity.status(200);
            return ResponseEntity.ok(miartista);
        } catch (Exception e) {
            System.out.println("El error es: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
