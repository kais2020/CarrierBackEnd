package com.carrier.scc.Controller;

import com.carrier.scc.dao.ClientDao;
import com.carrier.scc.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class ClientController {
    @Autowired
    private ClientDao clientDao;

    @GetMapping(value = "clients")
    public List<Client> afficheToutClients(){

        return clientDao.findAll();
    }
    @GetMapping(value = "clients/id/{id}")
    public Optional<Client> afficheClientParId(@PathVariable int id){
        return clientDao.findById(id);
    }
    @GetMapping(value = "clients/code/{code}")
    public Client afficheClientParCode(@PathVariable String code){
        return clientDao.findByCode(code);
    }
}
