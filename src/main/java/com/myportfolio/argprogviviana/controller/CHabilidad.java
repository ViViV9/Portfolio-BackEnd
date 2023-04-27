package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Habilidad;
import com.myportfolio.argprogviviana.service.SHabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("habilidad")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CHabilidad {
    @Autowired
    SHabilidad habilidadServ;
    @GetMapping("/lista")
    @ResponseBody
    public List<Habilidad> verHabilidades(){
        return habilidadServ.verHabilidades();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Habilidad buscarHabilidad(@PathVariable int id) {
        return habilidadServ.buscarHabilidad(id);
    }

    @PostMapping("/crear")
    public String crearHabilidad(@RequestBody Habilidad skill){
        habilidadServ.crearHabilidad(skill);
        return "La habilidad fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarHabilidad(@PathVariable int id){
        habilidadServ.borrarHabilidad(id);
        return "La habilidad fue borrada correctamente";
    }

    @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidad skill) {
        habilidadServ.editarHabilidad(skill);
    }

}
