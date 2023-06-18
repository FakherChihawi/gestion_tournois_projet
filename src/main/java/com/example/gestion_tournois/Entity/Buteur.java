package com.example.gestion_tournois.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Buteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origine;
    private int minute;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Joueur joueur;

    // Constructeurs, getters et setters


    public Buteur(String origine, int minute, Equipe equipe, Joueur joueur) {
        this.origine = origine;
        this.minute = minute;
        this.equipe = equipe;
        this.joueur = joueur;
    }

    public Buteur() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}