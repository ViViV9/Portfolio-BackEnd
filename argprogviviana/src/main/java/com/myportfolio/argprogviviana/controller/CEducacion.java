package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Educacion;
import com.myportfolio.argprogviviana.service.SEducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("educacion")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CEducacion {
    @Autowired
    SEducacion educacionService;
    @GetMapping("/lista")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return educacionService.verEducaciones();
    }

    @PostMapping("/crear")
    public String crearEducacion(@RequestBody Educacion educ){
        educacionService.crearEducacion(educ);
        return "Fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarEducacion(@PathVariable int id){
        educacionService.borrarEducacion(id);
        return "Se ha eliminado correctamente";
    }

    @PutMapping("/editar")
    public void editarEducacion(@RequestBody Educacion educ){
        educacionService.editarEducacion(educ);
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Integer id){
        return educacionService.buscarEducacion(id);
    }
}
