package com.carrier.scc.Controller;

import com.carrier.scc.dao.CamionDao;
import com.carrier.scc.model.Camion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CamionController {

    @Autowired
    private CamionDao camionDao;

    //Afficher tou les camions
    @GetMapping(value = "camions")
    public List<Camion> afficheAllCamions(){
        return camionDao.findAll();
    }
    //Affiche un camion
    @GetMapping(value = "camions/id/{id}")
    public Optional<Camion> afficheCamionParId(@PathVariable int id){

        return camionDao.findById(id);
    }
    @GetMapping(value = "camions/code/{code}")
    public Camion afficheCamionParCode(@PathVariable String code){
        return camionDao.findByCode(code);
    }
    @GetMapping(value = "camions/matricule/{matricule}")
    public Camion afficheCamionParMatricule(@PathVariable String mat){
        return camionDao.findByMatricule(mat);
    }
    @GetMapping(value = "camions/liste/code/{code}")
    public List<Camion> afficheAllCamionParCode(@PathVariable String code){
        return camionDao.findAllByCode(code);
    }
    @GetMapping(value = "camions/liste/matricule/{matricule}")
    public List<Camion> afficheAllCamionParMatricule(@PathVariable String mat){
        return camionDao.findAllByMatricule(mat);
    }
    @PostMapping(value = "camions")
    public void saveCamion(@RequestBody Camion camion){
        camionDao.save(camion);
    }
    @DeleteMapping(value = "camions/id/{id}")
    public void deleteCamion(@PathVariable int id){
        camionDao.deleteById(id);
    }

}
