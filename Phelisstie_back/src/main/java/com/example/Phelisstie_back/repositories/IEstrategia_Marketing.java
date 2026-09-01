package com.example.Phelisstie_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Phelisstie_back.models.Estrategia_Marketing;

@Repository
public interface IEstrategia_Marketing extends JpaRepository<Estrategia_Marketing, Integer>{

}
