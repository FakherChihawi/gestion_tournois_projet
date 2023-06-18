package com.example.gestion_tournois.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Carton implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private MatchFoot match;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Joueur joueur;

    private String type; // Jaune ou Rouge
    private int minute;

    public Carton(MatchFoot match, Equipe equipe, Joueur joueur, String type, int minute) {
        this.match = match;
        this.equipe = equipe;
        this.joueur = joueur;
        this.type = type;
        this.minute = minute;
    }

    public Carton() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MatchFoot getMatch() {
        return match;
    }

    public void setMatch(MatchFoot match) {
        this.match = match;
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
}
