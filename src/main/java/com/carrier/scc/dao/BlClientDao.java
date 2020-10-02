package com.carrier.scc.dao;

import com.carrier.scc.model.BlClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlClientDao extends JpaRepository<BlClient,Integer> {
}
