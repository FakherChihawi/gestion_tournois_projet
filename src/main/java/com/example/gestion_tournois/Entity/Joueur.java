package com.example.gestion_tournois.Entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Joueur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String pays;
    private double salaire;
    private int matchsJoues;
    private int avertissementsRecus;
    private int avertissementsActifs;
    private int expulsions;
    private int matchsSuspendus;
    private boolean competitif;

    @ManyToOne
    private Equipe equipe;

    public Joueur(String nom, String prenom, Date dateNaissance, String pays, double salaire, int matchsJoues, int avertissementsRecus, int avertissementsActifs, int expulsions, int matchsSuspendus, boolean competitif, Equipe equipe) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.pays = pays;
        this.salaire = salaire;
        this.matchsJoues = matchsJoues;
        this.avertissementsRecus = avertissementsRecus;
        this.avertissementsActifs = avertissementsActifs;
        this.expulsions = expulsions;
        this.matchsSuspendus = matchsSuspendus;
        this.competitif = competitif;
        this.equipe = equipe;
    }

    public Joueur() {

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

    public int getMatchsJoues() {
        return matchsJoues;
    }

    public void setMatchsJoues(int matchsJoues) {
        this.matchsJoues = matchsJoues;
    }

    public int getAvertissementsRecus() {
        return avertissementsRecus;
    }

    public void setAvertissementsRecus(int avertissementsRecus) {
        this.avertissementsRecus = avertissementsRecus;
    }

    public int getAvertissementsActifs() {
        return avertissementsActifs;
    }

    public void setAvertissementsActifs(int avertissementsActifs) {
        this.avertissementsActifs = avertissementsActifs;
    }

    public int getExpulsions() {
        return expulsions;
    }

    public void setExpulsions(int expulsions) {
        this.expulsions = expulsions;
    }

    public int getMatchsSuspendus() {
        return matchsSuspendus;
    }

    public void setMatchsSuspendus(int matchsSuspendus) {
        this.matchsSuspendus = matchsSuspendus;
    }

    public boolean isCompetitif() {
        return competitif;
    }

    public void setCompetitif(boolean competitif) {
        this.competitif = competitif;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
}
