package com.carrier.scc.dao;

import com.carrier.scc.model.Camion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CamionDao extends JpaRepository<Camion,Integer> {
    Camion findByCode(String code);

    Camion findByMatricule(String mat);

    List<Camion> findAllByCode(String code);

    List<Camion> findAllByMatricule(String mat);
}
