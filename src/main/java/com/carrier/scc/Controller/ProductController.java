package com.carrier.scc.Controller;

import com.carrier.scc.dao.ProductDao;
import com.carrier.scc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;


    //tout les produits
    @GetMapping(value = "produits")
    public List<Product> afficheToutProduits(){

        return productDao.findAll();

    }

    //Produit {id}
    @GetMapping(value = "produits/{id}")
    public Optional<Product> afficheUnProduit(@PathVariable int id){

        return productDao.findById(id);

    }
}
