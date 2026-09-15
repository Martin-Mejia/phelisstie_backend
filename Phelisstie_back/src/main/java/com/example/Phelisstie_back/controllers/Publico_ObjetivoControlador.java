package com.example.Phelisstie_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phelisstie_back.models.Publico_Objetivo;
import com.example.Phelisstie_back.services.Publico_Objetivo_Servicio;

@RestController
@RequestMapping("/phelisstie/publico_objetivos")
public class Publico_ObjetivoControlador {

    @Autowired 
    private Publico_Objetivo_Servicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Publico_Objetivo datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarPublico_Objetivo(datos));
    }

    @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarPublico_Objetivo());
    }

    public ResponseEntity<?> buscarPorId(Integer id){
        return ResponseEntity.status(HttpStatus.FOUND).body(this.servicio.buscarPublico_ObjetivoPorId(id));
    }

}
