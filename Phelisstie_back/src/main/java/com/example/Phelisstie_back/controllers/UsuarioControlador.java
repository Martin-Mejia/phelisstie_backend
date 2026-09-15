package com.example.Phelisstie_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phelisstie_back.models.Usuario;
import com.example.Phelisstie_back.services.Usuario_Servicio;

@RestController
@RequestMapping("/phelisstie/usuarios")
public class UsuarioControlador {

    @Autowired 
    private  Usuario_Servicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Usuario datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarUsuario(datos));
    }

    @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarUsuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(Integer id){
        return ResponseEntity.status(HttpStatus.FOUND).body(this.servicio.buscarUsuarioPorId(id));
    }

}
