package com.example.gestion_tournois.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_joueur")
public class GardienDeBut extends Joueur implements Serializable {
    private int butsEncaisses;
    private int cleanSheet;

    // Constructeurs, getters et setters

    public GardienDeBut(int butsEncaisses, int cleanSheet) {
        this.butsEncaisses = butsEncaisses;
        this.cleanSheet = cleanSheet;
    }

    public GardienDeBut() {

    }

    public int getButsEncaisses() {
        return butsEncaisses;
    }

    public void setButsEncaisses(int butsEncaisses) {
        this.butsEncaisses = butsEncaisses;
    }

    public int getCleanSheet() {
        return cleanSheet;
    }

    public void setCleanSheet(int cleanSheet) {
        this.cleanSheet = cleanSheet;
    }
}