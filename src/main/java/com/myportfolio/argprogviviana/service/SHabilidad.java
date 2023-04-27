package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.Habilidad;
import com.myportfolio.argprogviviana.repository.RHabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class SHabilidad {
    @Autowired
    private RHabilidad habilidadRepo;

    public List<Habilidad> verHabilidades(){
        return habilidadRepo.findAll();
    }
    public void crearHabilidad(Habilidad skill){
        habilidadRepo.save(skill);
    }

    public void borrarHabilidad(int id){
        habilidadRepo.deleteById(id);
    }
    public void editarHabilidad(Habilidad skill){
        habilidadRepo.save(skill);
    }

    public Habilidad buscarHabilidad(Integer id) {
        Habilidad skill = habilidadRepo.findById(id).orElse(null);
        return skill;
    }
}
