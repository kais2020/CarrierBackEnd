package com.carrier.scc.dao;

import com.carrier.scc.model.Camion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamionDao extends JpaRepository<Camion,Integer> {
}
