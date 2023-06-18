package com.example.gestion_tournois.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Changement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Equipe equipe;

    @ManyToOne
    private Joueur joueurSortant;

    @ManyToOne
    private Joueur joueurEntrant;

    private int minute;

    // Constructeurs, getters et setters

    public Changement(Equipe equipe, Joueur joueurSortant, Joueur joueurEntrant, int minute) {
        this.equipe = equipe;
        this.joueurSortant = joueurSortant;
        this.joueurEntrant = joueurEntrant;
        this.minute = minute;
    }

    public Changement() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Joueur getJoueurSortant() {
        return joueurSortant;
    }

    public void setJoueurSortant(Joueur joueurSortant) {
        this.joueurSortant = joueurSortant;
    }

    public Joueur getJoueurEntrant() {
        return joueurEntrant;
    }

    public void setJoueurEntrant(Joueur joueurEntrant) {
        this.joueurEntrant = joueurEntrant;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
