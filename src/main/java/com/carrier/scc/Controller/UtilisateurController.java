package com.carrier.scc.Controller;

import com.carrier.scc.dao.UtilisateurDao;
import com.carrier.scc.model.Utilisateur;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao ;
//*** Get Mapping ***//
    @GetMapping(value = "util")
    public List<Utilisateur> afiicheToutUtilisateur(){
       return utilisateurDao.findAll();
    }
    @GetMapping(value = "util/id/{id}")
    public Utilisateur rechercheUtilisateurparId(@PathVariable int id){
        return utilisateurDao.findById(id);
    }

    @GetMapping(value = "util/{login}/{password}")
    public Utilisateur rechercheUtilLoginPassword(@PathVariable(value = "login") String login,
                                                  @PathVariable(value = "password") String password){
        return utilisateurDao.findByLoginAndPassword(login,password);
    }
//**** Post Mapping ***//
    @PostMapping(value = "util")
    public Utilisateur  saveUtil(@RequestBody Utilisateur utilisateur){
        return utilisateurDao.save(utilisateur);
    }
}
