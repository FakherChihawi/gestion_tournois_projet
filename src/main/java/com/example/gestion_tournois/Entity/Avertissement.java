package com.example.gestion_tournois.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Avertissement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // Jaune ou Rouge
    private int minute;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Joueur joueur;

    public Avertissement(String type, int minute, Equipe equipe) {
        this.type = type;
        this.minute = minute;
        this.equipe = equipe;
    }

    public Avertissement(String type, int minute, Equipe equipe, Joueur joueur) {
        this.type = type;
        this.minute = minute;
        this.equipe = equipe;
        this.joueur = joueur;
    }

    public Avertissement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
