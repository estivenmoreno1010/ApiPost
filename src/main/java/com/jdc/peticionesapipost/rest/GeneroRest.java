package com.jdc.peticionesapipost.rest;

import com.jdc.peticionesapipost.dto.ArtistaDTO;
import com.jdc.peticionesapipost.models.GeneroEntity;
import com.jdc.peticionesapipost.service.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/genero")
public class GeneroRest {
    @Autowired
    private IGeneroService generoService;

    @PostMapping("/crear")
    public ResponseEntity<GeneroEntity> crear(@RequestBody GeneroEntity generoRequest) {
            try {
                generoService.save(generoRequest);
                ResponseEntity.status(200);
                return ResponseEntity.ok(generoRequest);
            } catch (Exception e) {
                System.out.println("El error es: " + e.getMessage());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

            }
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<GeneroEntity> editar(@Validated
                                                   @RequestBody GeneroEntity generoRequest, @PathVariable("id") Long id) {
        GeneroEntity generoExistente = generoService.findById(id);
        generoExistente.setNombre(generoRequest.getNombre());
        generoService.save(generoExistente);
        return ResponseEntity.ok(generoExistente);
    }
    @GetMapping("/list")
    private ResponseEntity<List<GeneroEntity>> listar() {
        return ResponseEntity.ok(generoService.findAll());
    }

    @DeleteMapping("/deleteBy/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        generoService.delete(id);
        return ResponseEntity.ok("Eliminado el genero");
    }
}
