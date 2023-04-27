package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.Persona;
import com.myportfolio.argprogviviana.repository.RPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SPersona{
    @Autowired
     private RPersona personaRepo;

    public List<Persona> verPersonas(){
        return  personaRepo.findAll();
    }
    public Persona buscarPersona(Integer id) {
        Persona perso= personaRepo.findById(id).orElse(null);
        return perso;
    }
    public void crearPersona(Persona perso){
        personaRepo.save(perso);
    }
    public void borrarPersona(int id){
        personaRepo.deleteById(id);
    }
    public void editarPersona(Persona perso){
        personaRepo.save(perso);
    }

    public Persona login(String email, String password) {
        return personaRepo.findByEmailAndPassword(email, password);
    }

}
