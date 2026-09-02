package com.example.Phelisstie_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.models.Estrategia_Marketing;
import com.example.Phelisstie_back.repositories.IEstrategia_Marketing;

@Service
public class Estrategia_Marketing_Servicio {

    @Autowired
    private IEstrategia_Marketing repositorio;

    public boolean guardarEstrategia_Marketing(Estrategia_Marketing datosEstrategia_Marketing){
        Estrategia_Marketing estrategia_marketingGuardado=this.repositorio.save(datosEstrategia_Marketing);
        return true;
    }

    public List<Estrategia_Marketing>buscarEstrategia_Marketing(){
        return this.repositorio.findAll();
    }

}
