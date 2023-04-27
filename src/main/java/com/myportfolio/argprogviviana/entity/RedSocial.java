package com.myportfolio.argprogviviana.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RedSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String url;
    private String icono_red;

    public RedSocial() {
    }

    public RedSocial(String url, String icono_red) {
        this.url = url;
        this.icono_red = icono_red;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcono_red() {
        return icono_red;
    }

    public void setIcono_red(String icono_red) {
        this.icono_red = icono_red;
    }
}
