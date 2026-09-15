package com.example.Phelisstie_back.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Phelisstie_back.models.Empresa;
import com.example.Phelisstie_back.services.Empresa_Servicio;

@RestController
@RequestMapping("/phelisstie/empresas")
public class EmpresaControlador {

    @Autowired 
    private Empresa_Servicio servicio;

    @PostMapping 
    public ResponseEntity<?>guardar(@RequestBody Empresa datos){
        return ResponseEntity.status(HttpStatus.OK).body(servicio.guardarEmpresa(datos));
    }

    @GetMapping 
    public ResponseEntity<?>buscar(){
        return ResponseEntity.status(HttpStatus.FOUND).body(servicio.buscarEmpresa());
    }

    public ResponseEntity<?> buscarPorId(Integer id){
        return ResponseEntity.status(HttpStatus.FOUND).body(this.servicio.BuscarEmpresaPorId((id)));
    }

}
