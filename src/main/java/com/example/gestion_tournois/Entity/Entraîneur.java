package com.example.gestion_tournois.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
public class Entraîneur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String pays;
    private double salaire;
    private int matchs;

    @OneToMany(mappedBy = "entraineur", cascade = CascadeType.ALL)
    private List<Equipe> equipes;

    // Constructeurs, getters et setters


    public Entraîneur(Long id, String nom, String prenom, Date dateNaissance, String pays, double salaire, int matchs) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.pays = pays;
        this.salaire = salaire;
        this.matchs = matchs;
    }

    public Entraîneur(String nom, String prenom, Date dateNaissance, String pays, double salaire, int matchs, List<Equipe> equipes) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.pays = pays;
        this.salaire = salaire;
        this.matchs = matchs;
        this.equipes = equipes;
    }

    public Entraîneur(String nom, String prenom, Date dateNaissance, String pays, double salaire, int matchs) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.pays = pays;
        this.salaire = salaire;
        this.matchs = matchs;
    }

    public Entraîneur() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getMatchs() {
        return matchs;
    }

    public void setMatchs(int matchs) {
        this.matchs = matchs;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }
}
