package com.example.Phelisstie_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public Estrategia_Marketing buscarEstrategia_MarketingPorId(Integer id){
        Optional<Estrategia_Marketing> estretegia_marketingBuscado = this.repositorio.findById(id);
        if (estretegia_marketingBuscado.isPresent()){
            return estretegia_marketingBuscado.get();
        } else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
        }
    }
}
