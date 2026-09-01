package com.example.Phelisstie_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.repositories.IEstrategia_Marketing;

@Service
public class Estrategia_Marketing_Servicio {

    @Autowired
    IEstrategia_Marketing repositorio;

}
