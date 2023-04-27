package com.myportfolio.argprogviviana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre_empresa;
    private String puesto;
    private String logo_expe;

    private String desde;

    private String hasta;

    public Experiencia() {
    }

    public Experiencia(String nombre_empresa, String puesto, String logo_expe, String desde, String hasta) {
        this.nombre_empresa = nombre_empresa;
        this.puesto = puesto;
        this.logo_expe = logo_expe;
        this.desde = desde;
        this.hasta = hasta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLogo_expe() {
        return logo_expe;
    }

    public void setLogo_expe(String logo_expe) {
        this.logo_expe = logo_expe;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }
}
