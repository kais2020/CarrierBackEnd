package com.carrier.scc.Controller;

import com.carrier.scc.dao.BlClientDao;
import com.carrier.scc.model.BlClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BlClientController {
    @Autowired
    private BlClientDao blClientDao;

    //Afficher All BL Client
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
}
