package com.example.Phelisstie_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.models.Publico_Objetivo;
import com.example.Phelisstie_back.repositories.IPublico_Objetivo;

@Service
public class Publico_Objetivo_Servicio {

    @Autowired
    private IPublico_Objetivo repositorio;

    public boolean guardarPublico_Objetivo(Publico_Objetivo datosPublico_Objetivo){
        Publico_Objetivo publico_objetivoGuardado=this.repositorio.save(datosPublico_Objetivo);
        return true;
    }

    public List<Publico_Objetivo>buscarPublico_Objetivo(){
        return this.repositorio.findAll();
    }

}
