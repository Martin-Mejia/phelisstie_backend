package com.example.Phelisstie_back.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.models.Red_Social;
import com.example.Phelisstie_back.repositories.IRed_Social;

@Service
public class Red_Social_Servicio {

    @Autowired
    private IRed_Social repositorio;

    public boolean guardarRed_Servicio(Red_Social datRed_Social){

        Red_Social red_socialGuardado=this.repositorio.save(datRed_Social);
        return true;
    }


    public List<Red_Social>buscarRed_servicio(){
        return this.repositorio.findAll();
    }

}
