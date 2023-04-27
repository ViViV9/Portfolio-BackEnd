package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.Experiencia;
import com.myportfolio.argprogviviana.repository.RExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    private RExperiencia expeRepo;

    public List<Experiencia> verExperiencias(){
        return expeRepo.findAll();
    }

    public void crearExperiencia(Experiencia expe){
        expeRepo.save(expe);
    }

    public void borrarExperiencia(int id){
        expeRepo.deleteById(id);
    }

    public void editarExperiencia(Experiencia expe){
        expeRepo.save(expe);
    }

    public Experiencia buscarExperiencia(Integer id) {
        Experiencia expe = expeRepo.findById(id).orElse(null);
        return expe;
    }
}
