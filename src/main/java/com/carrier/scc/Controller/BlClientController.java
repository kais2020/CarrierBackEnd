package com.carrier.scc.Controller;

import com.carrier.scc.dao.BlClientDao;
import com.carrier.scc.model.BlClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Api(description = "Gestion des Bons de Livraison")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BlClientController {
    @Autowired
    private BlClientDao blClientDao;

    //Afficher All BL Client
    @ApiOperation(value = "Récupere tous les BL")
    @GetMapping(value = "blclients")
    public List<BlClient> afficheAllBl(){

        return blClientDao.findAll();
    }
    @GetMapping(value = "blclients/id/{id}")
    public Optional<BlClient> afficheBlClientParId(@PathVariable int id){
        return blClientDao.findById(id);
    }
    @GetMapping(value = "blclients/num/{num}")
    public BlClient afficheBlClientParNum(@PathVariable int num){
        return blClientDao.findByNum(num);
    }
    @GetMapping(value = "blclients/liste/parclient/{client}")
    public List<BlClient> afficheListeBlParClient(@PathVariable int client_id){
        return blClientDao.findAllByClient_id(client_id);
    }
    @GetMapping(value = "blclients/liste/filtredate/{datedebut}/{datefin}")
    public List<BlClient> filtreBlClientParDate(
            @PathVariable("datedebut") @DateTimeFormat(pattern = "dd-MM-yyy") Date datedebut
            ,@PathVariable("datefin") @DateTimeFormat(pattern = "dd-MM-yyyy") Date datefin){
         return blClientDao.findByDateBlBetween(datedebut,datefin);
    }
    @PostMapping(value = "blclients")
    public void saveBlClient(@RequestBody BlClient blClient){
        blClientDao.save(blClient);
    }
}
