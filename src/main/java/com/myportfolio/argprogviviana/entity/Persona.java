package com.myportfolio.argprogviviana.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String apellido;
    private String titulo;
    @Lob
    @Column(length = 1000)
    private String foto_perfil;
    @Lob
    @Column(length = 1000)
    private String textsobre_mi;
    @Lob
    @Column(length = 1000)
    private String textsobre_mi2;
    @Lob
    @Column(length = 1000)
    private String textsobre_mi3;
    private String cv;

    private String email;

    private String password;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String titulo, String foto_perfil, String textsobre_mi, String textsobre_mi2, String textsobre_mi3, String cv, String email, String password){
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.foto_perfil = foto_perfil;
        this.textsobre_mi = textsobre_mi;
        this.textsobre_mi2 = textsobre_mi2;
        this.textsobre_mi3 = textsobre_mi3;
        this.cv = cv;
        this.email = email;
        this.password = password;
    }
}
