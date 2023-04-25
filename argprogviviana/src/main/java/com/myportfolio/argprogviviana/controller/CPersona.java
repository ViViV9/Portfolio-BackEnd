package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.Persona;
import com.myportfolio.argprogviviana.service.SPersona;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    @Autowired
    SPersona personaServ;

    @GetMapping("/lista")
    @ResponseBody
    public List<Persona> verPersonas(){
        return personaServ.verPersonas();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable int id) {
        return personaServ.buscarPersona(id);
    }

    @PostMapping("/crear")
    public String crearPersona(@RequestBody Persona pers){
        personaServ.crearPersona(pers);
        return "La persona fue creada correctamente";
    }

    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona pers) {
        personaServ.editarPersona(pers);
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarPersona(@PathVariable int id){
        personaServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }

    @PostMapping("/login")
    @ResponseBody
    public Persona login(@RequestBody @NotNull Persona pers){
        return personaServ.login(pers.getEmail(), pers.getPassword());
    }

}
