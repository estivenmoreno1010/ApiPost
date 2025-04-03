package com.jdc.peticionesapipost.rest;

import com.jdc.peticionesapipost.models.DisqueraEntity;
import com.jdc.peticionesapipost.service.IDisqueraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/disquera")
public class DisqueraRest {
    @Autowired
    private IDisqueraService disqueraService;

    @PostMapping("/crear")
    public ResponseEntity<DisqueraEntity> crear(
            @RequestBody DisqueraEntity disqueraEntity
    ){
        disqueraService.save(disqueraEntity);
        return ResponseEntity.ok(disqueraEntity);
    }
}
