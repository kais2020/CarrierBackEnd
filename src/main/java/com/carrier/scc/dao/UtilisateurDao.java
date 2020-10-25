package com.carrier.scc.dao;

import com.carrier.scc.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findById(int id);
    Utilisateur findByLoginAndPassword(String login,String password);
}
