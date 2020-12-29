package com.carrier.scc.dao;

import com.carrier.scc.model.BlClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BlClientDao extends JpaRepository<BlClient,Integer> {
    BlClient findByNum(int num);

    List<BlClient> findAllByClient_id(int client_id);

    List<BlClient> findByDateBlBetween(Date datedebut, Date datefin);
}
