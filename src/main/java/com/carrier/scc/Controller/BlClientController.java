package com.carrier.scc.Controller;

import com.carrier.scc.dao.BlClientDao;
import com.carrier.scc.model.BlClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlClientController {
    @Autowired
    private BlClientDao blClientDao;

    //Afficher All BL Client
    @GetMapping(value = "blclients")
    public List<BlClient> afficheAllBl(){
        return blClientDao.findAll();
    }
}
