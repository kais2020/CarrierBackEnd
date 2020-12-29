package com.carrier.scc.dao;

import com.carrier.scc.model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ClientDaoTest {
    @Autowired
    private ClientDao clientDao;

    @Test
    void findByCode(){
        Client client = clientDao
                .save(new Client(4, "004", "tass", "BEN AROUS", "Tunis", "8989898ERT000"));
        assert (clientDao.findByCode("004").getId(),client.getId());
    }
}