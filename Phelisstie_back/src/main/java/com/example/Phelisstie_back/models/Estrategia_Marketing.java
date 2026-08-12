package com.example.Phelisstie_back.models;

public class Estrategia_Marketing {
    private Integer id_estrategia;
    private Integer id_empresa;
    private Double presupuesto_mensual;
    private String responsable_mkt;
    private String objetivo_principal;
    
    public Integer getId_estrategia() {
        return id_estrategia;
    }
    public void setId_estrategia(Integer id_estrategia) {
        this.id_estrategia = id_estrategia;
    }
    public Integer getId_empresa() {
        return id_empresa;
    }
    public void setId_empresa(Integer id_empresa) {
        this.id_empresa = id_empresa;
    }
    public Double getPresupuesto_mensual() {
        return presupuesto_mensual;
    }
    public void setPresupuesto_mensual(Double presupuesto_mensual) {
        this.presupuesto_mensual = presupuesto_mensual;
    }
    public String getResponsable_mkt() {
        return responsable_mkt;
    }
    public void setResponsable_mkt(String responsable_mkt) {
        this.responsable_mkt = responsable_mkt;
    }
    public String getObjetivo_principal() {
        return objetivo_principal;
    }
    public void setObjetivo_principal(String objetivo_principal) {
        this.objetivo_principal = objetivo_principal;
    }
    

}
