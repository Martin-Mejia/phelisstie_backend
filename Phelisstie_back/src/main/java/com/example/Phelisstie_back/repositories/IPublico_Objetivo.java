package com.example.Phelisstie_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Phelisstie_back.models.Publico_Objetivo;

@Repository
public interface IPublico_Objetivo extends  JpaRepository<Publico_Objetivo,Integer> {

}
