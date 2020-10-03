package com.carrier.scc.dao;

import com.carrier.scc.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client,Integer> {
    Client findByCode(String code);
}
