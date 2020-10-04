package com.carrier.scc.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BlClient {
    @Id
    @GeneratedValue
    private int id;
    private int num;
    private Date dateBl;
    private int qte;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "camion_id")
    private Camion camion;
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    public BlClient() {
    }

    public BlClient(int id, int num, Date dateBl, int qte, Client client, Camion camion, Produit produit) {
        this.id = id;
        this.num = num;
        this.dateBl = dateBl;
        this.qte = qte;
        this.client = client;
        this.camion = camion;
        this.produit = produit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDateBl() {
        return dateBl;
    }

    public void setDateBl(Date dateBl) {
        this.dateBl = dateBl;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "BlClient{" +
                "id=" + id +
                ", num=" + num +
                ", dateBl=" + dateBl +
                ", qte=" + qte +
                ", client=" + client +
                ", camion=" + camion +
                ", product=" + produit +
                '}';
    }
}
