package com.example.Phelisstie_back.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.Phelisstie_back.models.Usuario;
import com.example.Phelisstie_back.repositories.IUsuario;

@Service
public class Usuario_Servicio {

    @Autowired
    private IUsuario repositorio;

    //rutina para guardar datos de un usuario
    public boolean  guardarUsuario(Usuario datosUsuario){

        Usuario usuarioGuardado=this.repositorio.save(datosUsuario);
        return true;


    }

    //rutina para buscar todos los usuarios
    public List<Usuario>buscarUsuarios(){
        return this.repositorio.findAll();
    }

    //rutina para buscar un usuario por su id
    public Usuario buscarUsuarioPorId(Integer id){

        Optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
        if (usuarioBuscado.isPresent()){
            return usuarioBuscado.get();
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"error");
        }

    }

}
