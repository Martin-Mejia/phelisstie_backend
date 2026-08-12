package com.example.Phelisstie_back.models;

public class Red_Social {
    private Integer id_red;
    private Integer id_empresa;
    private String nombre_red;
    private String usuario_arroba;
    private Boolean activo;
    
    public Integer getId_red() {
        return id_red;
    }
    public void setId_red(Integer id_red) {
        this.id_red = id_red;
    }
    public Integer getId_empresa() {
        return id_empresa;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public String getNombre_red() {
        return nombre_red;
    }
    public void setNombre_red(String nombre_red) {
        this.nombre_red = nombre_red;
    }
    public String getUsuario_arroba() {
        return usuario_arroba;
    }
    public void setUsuario_arroba(String usuario_arroba) {
        this.usuario_arroba = usuario_arroba;
    }
    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    

}
