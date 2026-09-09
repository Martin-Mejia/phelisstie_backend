package com.example.Phelisstie_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phelisstie_back.models.Estrategia_Marketing;
import com.example.Phelisstie_back.services.Estrategia_Marketing_Servicio;

@RestController
@RequestMapping("/phellistie/estrategia_marketings")
public class Estrategia_MarketingControlador {

    @Autowired 
    private Estrategia_Marketing_Servicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Estrategia_Marketing datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarEstrategia_Marketing(datos));
    }

    @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarEstrategia_Marketing());
    }
}
