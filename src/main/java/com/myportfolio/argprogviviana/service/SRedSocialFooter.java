package com.myportfolio.argprogviviana.service;

import com.myportfolio.argprogviviana.entity.RedSocialFooter;
import com.myportfolio.argprogviviana.repository.RRedSocialFooter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SRedSocialFooter {
    @Autowired
    private RRedSocialFooter rdsFooterRepo;
    public List<RedSocialFooter> verRedesSocFooter(){
        return rdsFooterRepo.findAll();
    }
    public void crearRedSocialFooter(RedSocialFooter redfooter){
        rdsFooterRepo.save(redfooter);
    }

    public void borrarRedSocialFooter(int id){
        rdsFooterRepo.deleteById(id);
    }
    public void editarRedSocialFooter(RedSocialFooter redfooter){
        rdsFooterRepo.save(redfooter);
    }

    public RedSocialFooter buscarRedSocialFooter(Integer id) {
        RedSocialFooter redfooter = rdsFooterRepo.findById(id).orElse(null);
        return redfooter;
    }
}
