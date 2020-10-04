package com.carrier.scc.Controller;

import com.carrier.scc.dao.ClientDao;
import com.carrier.scc.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public class ClientController {
    @Autowired
    private ClientDao clientDao;
/* Requêtes GET */
    //Affiche All Client
    @GetMapping(value = "/clients")
    public List<Client> afficheToutClients(){

        return clientDao.findAll();
    }
    //Affiche Client par id
    @GetMapping(value = "/clients/id/{id}")
    public Optional<Client> afficheClientParId(@PathVariable int id){
        return clientDao.findById(id);
    }
    //Affiche Client par code
    @GetMapping(value = "/clients/code/{code}")
    public Client afficheClientParCode(@PathVariable String code){
        return clientDao.findByCode(code);
    }
    //Affiche Client par nom
    @GetMapping(value = "/clients/nom/{nom}")
    public Client afficheClientParNom(@PathVariable String nom){
        return  clientDao.findByNom(nom);
    }
    //Affiche Client par code TVA
    @GetMapping(value = "/clients/codetva/{tva}")
    public Client afficheClientParCodeTva(@PathVariable String tva){
        return clientDao.findByCodeTVA(tva);
    }
    //Affiche Liste Client par code
    @GetMapping(value = "/clients/liste/code/{code}")
    public List<Client> afficheListeClientParCode(@PathVariable String code){
        return  clientDao.findAllByCode(code);
    }
    //Affiche Liste Client par nom
    @GetMapping(value = "/clients/liste/nom/{nom}")
    public List<Client> afficheListeClientParNom(@PathVariable String nom){
        return clientDao.findAllByNom(nom);
    }
    //Affiche Liste Client par ville
    @GetMapping(value = "/clients/liste/ville/{ville}")
    public List<Client> afficheListeClientParVille(@PathVariable String ville){
        return  clientDao.findAllByVille(ville);
    }

/* Requêtes POST  */
    //Save Client
    @PostMapping(value = "/clients")
    public Client saveClient(@RequestBody Client client){
        return clientDao.save(client);
    }


}
