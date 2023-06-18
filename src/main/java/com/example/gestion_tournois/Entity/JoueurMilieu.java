package com.example.gestion_tournois.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_joueur")
public class JoueurMilieu extends Joueur implements Serializable {
    private int butsMarques;
    private double distanceParcourue;

    // Constructeurs, getters et setters

    public JoueurMilieu(String nom, String prenom, Date dateNaissance, String pays, double salaire, int matchsJoues, int avertissementsRecus, int avertissementsActifs, int expulsions, int matchsSuspendus, boolean competitif, Equipe equipe, int butsMarques, double distanceParcourue) {
        super(nom, prenom, dateNaissance, pays, salaire, matchsJoues, avertissementsRecus, avertissementsActifs, expulsions, matchsSuspendus, competitif, equipe);
        this.butsMarques = butsMarques;
        this.distanceParcourue = distanceParcourue;
    }

    public JoueurMilieu(int butsMarques, double distanceParcourue) {
        super();
        this.butsMarques = butsMarques;
        this.distanceParcourue = distanceParcourue;
    }

    public JoueurMilieu() {

    }

    public int getButsMarques() {
        return butsMarques;
    }

    public void setButsMarques(int butsMarques) {
        this.butsMarques = butsMarques;
    }

    public double getDistanceParcourue() {
        return distanceParcourue;
    }

    public void setDistanceParcourue(double distanceParcourue) {
        this.distanceParcourue = distanceParcourue;
    }
}