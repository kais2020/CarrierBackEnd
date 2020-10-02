package com.carrier.scc.Controller;

import com.carrier.scc.dao.ClientDao;
import com.carrier.scc.model.Client;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientController {
    @Autowired
    private ClientDao clientDao;

    public List<Client> AfficheToutClient(){
        return clientDao.findAll();
    }
}
