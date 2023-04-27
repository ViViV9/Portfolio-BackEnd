package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.Educacion;
import com.myportfolio.argprogviviana.repository.REducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SEducacion {
    @Autowired
    private REducacion educacionRepo;

    public List<Educacion> verEducaciones(){
        return educacionRepo.findAll();
    }

    public void crearEducacion(Educacion educ){
        educacionRepo.save(educ);
    }

    public void borrarEducacion(int id){
        educacionRepo.deleteById(id);
    }

    public void editarEducacion(Educacion educ){
        educacionRepo.save(educ);
    }

    public Educacion buscarEducacion(Integer id) {
       Educacion educ = educacionRepo.findById(id).orElse(null);
       return educ;
    }

}
