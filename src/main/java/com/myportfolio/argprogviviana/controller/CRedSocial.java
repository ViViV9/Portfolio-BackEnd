package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.RedSocial;
import com.myportfolio.argprogviviana.service.SRedSocial;
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
@RequestMapping("redsocial")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CRedSocial {
    @Autowired
    SRedSocial redsocServ;
    @GetMapping("/lista")
    @ResponseBody
    public List<RedSocial>verRedesSociales(){
        return redsocServ.verRedesSociales();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public RedSocial buscarRedSocial(@PathVariable int id) {
        return redsocServ.buscarRedSocial(id);
    }

    @PostMapping("/crear")
    public String crearRedSocial(@RequestBody RedSocial reds){
        redsocServ.crearRedSocial(reds);
        return "La red social fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarRedSocial(@PathVariable int id){
        redsocServ.borrarRedSocial(id);
        return "La red social fue borrada correctamente";
    }

    @PutMapping("/editar")
    public void editarRedSocial(@RequestBody RedSocial reds) {
        redsocServ.editarRedSocial(reds);
    }
}
