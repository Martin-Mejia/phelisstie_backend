package com.example.Phelisstie_back.models;

public class Publico_Objetivo {
    private Integer id_publico;
    private Integer id_empresa;
    private String rango_edad;
    private String ubicacion_cliente;
    private String descripcion_cliente;
    
    public Integer getId_publico() {
        return id_publico;
    }
    public void setId_publico(Integer id_publico) {
        this.id_publico = id_publico;
    }
    public Integer getId_empresa() {
        return id_empresa;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public String getRango_edad() {
        return rango_edad;
    }
    public void setRango_edad(String rango_edad) {
        this.rango_edad = rango_edad;
    }
    public String getUbicacion_cliente() {
        return ubicacion_cliente;
    }
    public void setUbicacion_cliente(String ubicacion_cliente) {
        this.ubicacion_cliente = ubicacion_cliente;
    }
    public String getDescripcion_cliente() {
        return descripcion_cliente;
    }
    public void setDescripcion_cliente(String descripcion_cliente) {
        this.descripcion_cliente = descripcion_cliente;
    }
    
}
