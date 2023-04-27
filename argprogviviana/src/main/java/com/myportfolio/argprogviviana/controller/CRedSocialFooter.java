package com.myportfolio.argprogviviana.controller;

import com.myportfolio.argprogviviana.entity.RedSocialFooter;
import com.myportfolio.argprogviviana.service.SRedSocialFooter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("redfooter")
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://portfoliovivianaverachtert.web.app")
public class CRedSocialFooter {
    @Autowired
    SRedSocialFooter redFooterRepo;
    @GetMapping("/lista")
    @ResponseBody
    public List<RedSocialFooter> verRedesSFooter(){
        return redFooterRepo.verRedesSocFooter();
    }

    @GetMapping("/buscar/{id}")
    @ResponseBody
    public RedSocialFooter buscarRedSocialFooter(@PathVariable int id) {
        return redFooterRepo.buscarRedSocialFooter(id);
    }

    @PostMapping("/crear")
    public String crearRedSocialFooter(@RequestBody RedSocialFooter redfooter){
        redFooterRepo.crearRedSocialFooter(redfooter);
        return "La red social del footer fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarRedSocialFooter(@PathVariable int id){
        redFooterRepo.borrarRedSocialFooter(id);
        return "La red social del footer fue borrada correctamente";
    }

    @PutMapping("/editar")
    public void editarRedSocialFooter(@RequestBody RedSocialFooter redfooter) {
        redFooterRepo.editarRedSocialFooter(redfooter);
    }

}
