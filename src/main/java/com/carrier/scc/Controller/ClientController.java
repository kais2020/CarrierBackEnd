package com.carrier.scc.Controller;

import com.carrier.scc.dao.ClientDao;
import com.carrier.scc.exceptions.ClientIntrouvableException;
import com.carrier.scc.model.Client;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(description = "Gestion des Clients")
@RestController
public class ClientController {
    @Autowired
    private ClientDao clientDao;
/* Requêtes GET */
    //Affiche All Client
    @ApiOperation(value = "Récuperer tout Clients")
    @GetMapping(value = "clients")
    public List<Client> afficheToutClients(){

        return clientDao.findAll();
    }
    //Affiche Client par id
    @GetMapping(value = "clients/id/{id}")
    public Client afficheClientParId(@PathVariable int id) throws ClientIntrouvableException {

        Client client= clientDao.findById(id);
        if(client==null) throw  new ClientIntrouvableException("Client d'identifiant "+id+" n'existe pas");
        return client;
    }
    //Affiche Client par code
    @GetMapping(value = "clients/code/{code}")
    public Client afficheClientParCode(@PathVariable String code){
        return clientDao.findByCode(code);
    }
    //Affiche Client par nom
    @GetMapping(value = "clients/nom/{nom}")
    public Client afficheClientParNom(@PathVariable String nom){
        return  clientDao.findByNom(nom);
    }
    //Affiche Client par code TVA
    @GetMapping(value = "clients/codetva/{tva}")
    public Client afficheClientParCodeTva(@PathVariable String tva){
        return clientDao.findByCodeTVA(tva);
    }
    //Affiche Liste Client par code
    @GetMapping(value = "clients/liste/code/{code}")
    public List<Client> afficheListeClientParCode(@PathVariable String code){
        return  clientDao.findAllByCode(code);
    }
    //Affiche Liste Client par nom
    @GetMapping(value = "clients/liste/nom/{nom}")
    public List<Client> afficheListeClientParNom(@PathVariable String nom){
        return clientDao.findAllByNom(nom);
    }
    //Affiche Liste Client par ville
    @GetMapping(value = "clients/liste/ville/{ville}")
    public List<Client> afficheListeClientParVille(@PathVariable String ville){
        return  clientDao.findAllByVille(ville);
    }

/* Requêtes POST  */
    //Save Client
    @ApiOperation(value = "Sauvgarger un Produit")
    @PostMapping(value = "clients")
    public void saveClient(@RequestBody Client client){
         clientDao.save(client);
    }

/* Requêtes DELETE */
    //Delete Client par Id
    @ApiOperation(value = "Suprimer un Produit par son identifiant")
    @DeleteMapping(value = "clients/id/{id}")
    public void deleteClient(@PathVariable int id){
        clientDao.deleteById(id);
    }


}
