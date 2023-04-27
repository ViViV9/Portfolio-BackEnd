package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.Proyecto;
import com.myportfolio.argprogviviana.repository.RProyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SProyecto {
    @Autowired
    private RProyecto proyectoRepo;

    public List<Proyecto> verProyectos(){
        return  proyectoRepo.findAll();
    }

    public void crearProyecto(Proyecto proyect){
        proyectoRepo.save(proyect);
    }
    public void borrarProyecto(int id){
        proyectoRepo.deleteById(id);
    }
    public void editarProyecto(Proyecto proyect){
        proyectoRepo.save(proyect);
    }
    public Proyecto buscarProyecto(Integer id) {
        Proyecto proyec= proyectoRepo.findById(id).orElse(null);
        return proyec;
    }
}
