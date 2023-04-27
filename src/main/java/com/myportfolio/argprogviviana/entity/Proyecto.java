package com.myportfolio.argprogviviana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo_proyecto;
    private String imagen_proyecto;
    private String url_proyecto;
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(String titulo_proyecto, String imagen_proyecto, String url_proyecto, String descripcion) {
        this.titulo_proyecto = titulo_proyecto;
        this.imagen_proyecto = imagen_proyecto;
        this.url_proyecto = url_proyecto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo_proyecto() {
        return titulo_proyecto;
    }

    public void setTitulo_proyecto(String titulo_proyecto) {
        this.titulo_proyecto = titulo_proyecto;
    }

    public String getImagen_proyecto() {
        return imagen_proyecto;
    }

    public void setImagen_proyecto(String imagen_proyecto) {
        this.imagen_proyecto = imagen_proyecto;
    }

    public String getUrl_proyecto() {
        return url_proyecto;
    }

    public void setUrl_proyecto(String url_proyecto) {
        this.url_proyecto = url_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
