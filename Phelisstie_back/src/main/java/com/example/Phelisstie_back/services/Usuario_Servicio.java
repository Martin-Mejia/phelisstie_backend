package com.example.Phelisstie_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.repositories.IUsuario;

@Service
public class Usuario_Servicio {

    @Autowired
    IUsuario repositorio;

}
