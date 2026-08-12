package com.example.Phelisstie_back.models;

public class Empresa {
    private Integer id_empresa;
    private Integer id_usuario;
    private String nombre_empresa;
    private String sector;
    private String tamaño_empresa;
    
    public Integer getId_empresa() {
        return id_empresa;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public Integer getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNombre_empresa() {
        return nombre_empresa;
    }
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public String getTamaño_empresa() {
        return tamaño_empresa;
    }
    public void setTamaño_empresa(String tamaño_empresa) {
        this.tamaño_empresa = tamaño_empresa;
    }

    
}
