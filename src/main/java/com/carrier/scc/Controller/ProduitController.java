package com.carrier.scc.Controller;

import com.carrier.scc.dao.ProduitDao;
import com.carrier.scc.exceptions.ProduitIntrouvableException;
import com.carrier.scc.model.Produit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(description = "Gestion des Produits")
@RestController
public class ProduitController {

    @Autowired
    private ProduitDao produitDao;

/* Requetes GET */
    //tout les produits
    @ApiOperation(value = "Récuperer tous les Produits")
    @GetMapping(value = "produits")
    public List<Produit> afficheToutProduits(){

        return produitDao.findAll();

    }
    //Produit par id
    @ApiOperation(value = "Récupere un Produit par son identifiant")
    @GetMapping(value = "produits/id/{id}")
    public Produit afficheUnProduitParId(@PathVariable int id) throws ProduitIntrouvableException {

        Produit produit = produitDao.findById(id);

        if(produit == null) throw new ProduitIntrouvableException("le Produit d'identifiant "+id+" n'existe pas");
        return produit;

    }
    //Produit par code
    @ApiOperation(value = "Récupere un Produit par son code")
    @GetMapping(value = "produits/code/{code}")
    public Produit afficheUnProduitParCode(@PathVariable String code){
        return produitDao.findByCode(code);
    }

/* Requetes POST */
    //Save Produit
    @ApiOperation(value = "Sauvgarger un Produit")
    @PostMapping(value = "produits")
    public void saveProduit(@RequestBody Produit produit){
         produitDao.save(produit);
    }

/* Requêtes DELETE */
   // Delete Produit par Id
   @ApiOperation(value = "Suprimer un Produit par son identifiant")
   @DeleteMapping(value = "produits/id/{id}")
   public void deleteProduitParId(@PathVariable int id){
       produitDao.deleteById(id);
   }
}
