package com.example.Phelisstie_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.models.Empresa;
import com.example.Phelisstie_back.repositories.IEmpresa;

@Service
public class Empresa_Servicio {

    @Autowired
    private IEmpresa repositorio;

    public boolean guardarEmpresa(Empresa datoEmpresa){

        Empresa empresaGuardado=this.repositorio.save(datoEmpresa);
        return true;

    }
 
    public List<Empresa>buscarEmpresa(){
        return this.repositorio.findAll();
    }
}
