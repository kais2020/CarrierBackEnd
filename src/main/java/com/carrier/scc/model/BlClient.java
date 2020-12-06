package com.carrier.scc.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BlClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int num;
    private Date dateBl;
    private float qte;
    private float puVente;
    private float ht;
    private float taxe;
    private float tva;
    private float ttc;
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

    public BlClient(int id, int num, Date dateBl, float qte,float puVente ,float ht, float taxe, float tva, float ttc, Client client, Camion camion, Produit produit) {
        this.id = id;
        this.num = num;
        this.dateBl = dateBl;
        this.qte = qte;
        this.puVente=puVente;
        this.ht = ht;
        this.taxe = taxe;
        this.tva = tva;
        this.ttc = ttc;
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

    public float getQte() {
        return qte;
    }

    public void setQte(float qte) {
        this.qte = qte;
    }

    public float getPuVente() {
        return puVente;
    }

    public void setPuVente(float puVente) {
        this.puVente = puVente;
    }

    public float getHt() {
        return ht;
    }

    public void setHt(float ht) {
        this.ht = ht;
    }

    public float getTaxe() {
        return taxe;
    }

    public void setTaxe(float taxe) {
        this.taxe = taxe;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public float getTtc() {
        return ttc;
    }

    public void setTtc(float ttc) {
        this.ttc = ttc;
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
                ", ht=" + ht +
                ", taxe=" + taxe +
                ", tva=" + tva +
                ", ttc=" + ttc +
                ", client=" + client +
                ", camion=" + camion +
                ", produit=" + produit +
                '}';
    }
}
