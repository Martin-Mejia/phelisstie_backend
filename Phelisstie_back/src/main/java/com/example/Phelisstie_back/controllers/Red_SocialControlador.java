package com.example.Phelisstie_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phelisstie_back.models.Red_Social;
import com.example.Phelisstie_back.services.Red_Social_Servicio;

@RestController
@RequestMapping("/phellistie/red_sociales")
public class Red_SocialControlador {

    @Autowired 
    private Red_Social_Servicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Red_Social datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarRed_Servicio(datos));
    }

    @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarRed_servicio());
    }
}
 