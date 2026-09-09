package com.example.Phelisstie_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
    public Red_Social buscarRed_SocialPorId(Integer id){
        Optional<Red_Social> red_socialBuscado = this.repositorio.findById(id);
        if (red_socialBuscado.isPresent()) {
            return red_socialBuscado.get();
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
        }
    }
}
