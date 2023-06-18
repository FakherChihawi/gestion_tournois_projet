package com.example.gestion_tournois.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private Date dateCreation;
    private String pays;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    private List<Joueur> joueurs;

    @ManyToOne
    private Entraîneur entraineur;

    public Equipe() {
    }

    public Equipe(String nom, Date dateCreation, String pays, List<Joueur> joueurs, Entraîneur entraineur) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.pays = pays;
        this.joueurs = joueurs;
        this.entraineur = entraineur;
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public Entraîneur getEntraineur() {
        return entraineur;
    }

    public void setEntraineur(Entraîneur entraineur) {
        this.entraineur = entraineur;
    }
}