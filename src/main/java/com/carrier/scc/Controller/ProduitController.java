package com.carrier.scc.Controller;

import com.carrier.scc.dao.ProduitDao;
import com.carrier.scc.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitController {

    @Autowired
    private ProduitDao produitDao;

/* Requetes GET */
    //tout les produits
    @GetMapping(value = "produits")
    public List<Produit> afficheToutProduits(){

        return produitDao.findAll();

    }
    //Produit par id
    @GetMapping(value = "produits/id/{id}")
    public Optional<Produit> afficheUnProduitParId(@PathVariable int id){

        return produitDao.findById(id);

    }
    //Produit par code
    @GetMapping(value = "produits/code/{code}")
    public Produit afficheUnProduitParCode(@PathVariable String code){
        return produitDao.findByCode(code);
    }
/* Requetes POST */
    //Save Produit
    @PostMapping(value = "/produits")
    public Produit saveProduit(@RequestBody Produit produit){
        return produitDao.save(produit);
    }
}
