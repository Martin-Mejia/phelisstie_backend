package com.example.Phelisstie_back.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Phelisstie_back.models.Red_Social;

@Repository
public interface IRed_Social extends JpaRepository<Red_Social,Integer> {

}
