package com.example.Phelisstie_back.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Phelisstie_back.repositories.IEmpresa;

@Service
public class Empresa_Servicio {

    @Autowired
    IEmpresa repositorio;

}
