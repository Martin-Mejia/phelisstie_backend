package com.example.Phelisstie_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Phelisstie_back.models.Empresa;
import com.example.Phelisstie_back.models.Usuario;
import com.example.Phelisstie_back.repositories.IEmpresa;

@Service
public class Empresa_Servicio {

    @Autowired
    private IEmpresa repositorio;

    public boolean guardarEmpresa(Empresa datoEmpresa){

        Empresa empresaGuardado=this.repositorio.save(datoEmpresa);
        return true;

    }
 
    public List<Empresa>buscarEmpresa(){
        return this.repositorio.findAll();
    }

    public Empresa BuscarEmpresaPorId(Integer id){
        Optional<Empresa> empresaBuscado = this.repositorio.findById(id);
        if (empresaBuscado.isPresent()){
            return empresaBuscado.get();
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
        }

    }
}
