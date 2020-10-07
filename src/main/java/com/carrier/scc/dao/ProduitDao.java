package com.carrier.scc.dao;

import com.carrier.scc.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitDao extends JpaRepository<Produit,Integer> {
    Produit findById(int id);
    Produit findByCode(String code);

}
