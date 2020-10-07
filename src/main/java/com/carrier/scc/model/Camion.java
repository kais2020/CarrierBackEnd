package com.carrier.scc.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Camion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String matricule;
    private String marque;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @OneToMany(mappedBy = "camion")
    private List<BlClient> blClients;

    public Camion() {
    }

    public Camion(int id, String code, String matricule, String marque, Client client) {
        this.id = id;
        this.code = code;
        this.matricule = matricule;
        this.marque = marque;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", matricule='" + matricule + '\'' +
                ", marque='" + marque + '\'' +
                ", client=" + client +
                '}';
    }
}
