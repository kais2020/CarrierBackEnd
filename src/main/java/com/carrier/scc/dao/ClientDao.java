package com.carrier.scc.dao;

import com.carrier.scc.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientDao extends JpaRepository<Client,Integer> {
    Client findById(int id);

    Client findByCode(String code);

    Client findByNom(String nom);

    Client findByCodeTVA(String tva);

    List<Client> findAllByCode(String code);

    List<Client> findAllByNom(String nom);

    List<Client> findAllByVille(String ville);

}
