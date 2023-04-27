package com.myportfolio.argprogviviana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String curso;
    private String institucion;
    private String titulo_curso;
    private String logo_educ;
    private String inicio;
    private String fin;

    public Educacion() {
    }

    public Educacion(String curso, String institucion, String titulo_curso, String logo_educ, String inicio, String fin) {
        this.curso = curso;
        this.institucion = institucion;
        this.titulo_curso = titulo_curso;
        this.logo_educ = logo_educ;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo_curso() {
        return titulo_curso;
    }

    public void setTitulo_curso(String titulo_curso) {
        this.titulo_curso = titulo_curso;
    }

    public String getLogo_educ() {
        return logo_educ;
    }

    public void setLogo_educ(String logo_educ) {
        this.logo_educ = logo_educ;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
}
