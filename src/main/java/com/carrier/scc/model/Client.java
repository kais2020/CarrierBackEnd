package com.carrier.scc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String code;
    private String nom;
    private String adresse;
    private String codeTVA;

    @OneToMany(mappedBy = "client")
    private List<Camion> camions;
    @OneToMany(mappedBy = "client")
    private List<BlClient> blClients;



    public Client() {
    }

    public Client(int id, String code, String nom, String adresse, String codeTVA) {
        this.id = id;
        this.code = code;
        this.nom = nom;
        this.adresse = adresse;
        this.codeTVA = codeTVA;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodeTVA() {
        return codeTVA;
    }

    public void setCodeTVA(String codeTVA) {
        this.codeTVA = codeTVA;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", codeTVA='" + codeTVA + '\'' +
                '}';
    }
}
