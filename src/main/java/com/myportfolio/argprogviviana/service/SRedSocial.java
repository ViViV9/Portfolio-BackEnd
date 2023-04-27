package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.RedSocial;
import com.myportfolio.argprogviviana.repository.RRedSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SRedSocial {
    @Autowired
    private RRedSocial redsocialRepo;
    public List<RedSocial> verRedesSociales(){
        return redsocialRepo.findAll();
    }
    public void crearRedSocial(RedSocial reds){
        redsocialRepo.save(reds);
    }

    public void borrarRedSocial(int id){
        redsocialRepo.deleteById(id);
    }
    public void editarRedSocial(RedSocial reds){
        redsocialRepo.save(reds);
    }

    public RedSocial buscarRedSocial(Integer id) {
        RedSocial reds = redsocialRepo.findById(id).orElse(null);
        return reds;
    }
}
