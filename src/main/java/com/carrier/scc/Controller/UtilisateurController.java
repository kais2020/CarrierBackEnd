package com.carrier.scc.Controller;

import com.carrier.scc.dao.UtilisateurDao;
import com.carrier.scc.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurController {

    @Autowired
    private UtilisateurDao utilisateurDao ;

    @GetMapping(value = "util/id/{id}")
    public Utilisateur rechercheUtilisateurparId(@PathVariable int id){
        return utilisateurDao.findById(id);
    }

    @GetMapping(value = "util/{login}/{password}")
    public Utilisateur rechercheUtilLoginPassword(@PathVariable(value = "login") String login,
                                                  @PathVariable(value = "password") String password){
        return utilisateurDao.findByLoginAndPassword(login,password);
    }

}
