package com.carrier.scc.Controller;

import com.carrier.scc.dao.CamionDao;
import com.carrier.scc.model.Camion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CamionController {

    @Autowired
    private CamionDao camionDao;

    //Afficher tou les camions
    @GetMapping(value = "/camions")
    public List<Camion> afficheToutCamions(){
        return camionDao.findAll();
    }
    //Affiche un camion
    @GetMapping(value = "camions/{id}")
    public Optional<Camion> afficheUnCamion(@PathVariable int id){
       return camionDao.findById(id);
    }
}
