package com.example.gestion_tournois.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class MatchFoot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Equipe equipe1;

    @ManyToOne
    private Equipe equipe2;

    private Date date;
    private int butsEquipe1;
    private int butsEquipe2;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Buteur> buteursEquipe1;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Buteur> buteursEquipe2;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Changement> changementsEquipe1;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Changement> changementsEquipe2;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Avertissement> avertissementsEquipe1;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Avertissement> avertissementsEquipe2;

    private int minutesAdditionnellesPremiereMiTemps;
    private int minutesAdditionnellesDeuxiemeMiTemps;

    // Constructeurs, getters et setters


    public MatchFoot(Equipe equipe1, Equipe equipe2, Date date, int butsEquipe1, int butsEquipe2, List<Buteur> buteursEquipe1, List<Buteur> buteursEquipe2, List<Changement> changementsEquipe1, List<Changement> changementsEquipe2, List<Avertissement> avertissementsEquipe1, List<Avertissement> avertissementsEquipe2, int minutesAdditionnellesPremiereMiTemps, int minutesAdditionnellesDeuxiemeMiTemps) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.date = date;
        this.butsEquipe1 = butsEquipe1;
        this.butsEquipe2 = butsEquipe2;
        this.buteursEquipe1 = buteursEquipe1;
        this.buteursEquipe2 = buteursEquipe2;
        this.changementsEquipe1 = changementsEquipe1;
        this.changementsEquipe2 = changementsEquipe2;
        this.avertissementsEquipe1 = avertissementsEquipe1;
        this.avertissementsEquipe2 = avertissementsEquipe2;
        this.minutesAdditionnellesPremiereMiTemps = minutesAdditionnellesPremiereMiTemps;
        this.minutesAdditionnellesDeuxiemeMiTemps = minutesAdditionnellesDeuxiemeMiTemps;
    }

    public MatchFoot() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getButsEquipe1() {
        return butsEquipe1;
    }

    public void setButsEquipe1(int butsEquipe1) {
        this.butsEquipe1 = butsEquipe1;
    }

    public int getButsEquipe2() {
        return butsEquipe2;
    }

    public void setButsEquipe2(int butsEquipe2) {
        this.butsEquipe2 = butsEquipe2;
    }

    public List<Buteur> getButeursEquipe1() {
        return buteursEquipe1;
    }

    public void setButeursEquipe1(List<Buteur> buteursEquipe1) {
        this.buteursEquipe1 = buteursEquipe1;
    }

    public List<Buteur> getButeursEquipe2() {
        return buteursEquipe2;
    }

    public void setButeursEquipe2(List<Buteur> buteursEquipe2) {
        this.buteursEquipe2 = buteursEquipe2;
    }

    public List<Changement> getChangementsEquipe1() {
        return changementsEquipe1;
    }

    public void setChangementsEquipe1(List<Changement> changementsEquipe1) {
        this.changementsEquipe1 = changementsEquipe1;
    }

    public List<Changement> getChangementsEquipe2() {
        return changementsEquipe2;
    }

    public void setChangementsEquipe2(List<Changement> changementsEquipe2) {
        this.changementsEquipe2 = changementsEquipe2;
    }

    public List<Avertissement> getAvertissementsEquipe1() {
        return avertissementsEquipe1;
    }

    public void setAvertissementsEquipe1(List<Avertissement> avertissementsEquipe1) {
        this.avertissementsEquipe1 = avertissementsEquipe1;
    }

    public List<Avertissement> getAvertissementsEquipe2() {
        return avertissementsEquipe2;
    }

    public void setAvertissementsEquipe2(List<Avertissement> avertissementsEquipe2) {
        this.avertissementsEquipe2 = avertissementsEquipe2;
    }

    public int getMinutesAdditionnellesPremiereMiTemps() {
        return minutesAdditionnellesPremiereMiTemps;
    }

    public void setMinutesAdditionnellesPremiereMiTemps(int minutesAdditionnellesPremiereMiTemps) {
        this.minutesAdditionnellesPremiereMiTemps = minutesAdditionnellesPremiereMiTemps;
    }

    public int getMinutesAdditionnellesDeuxiemeMiTemps() {
        return minutesAdditionnellesDeuxiemeMiTemps;
    }

    public void setMinutesAdditionnellesDeuxiemeMiTemps(int minutesAdditionnellesDeuxiemeMiTemps) {
        this.minutesAdditionnellesDeuxiemeMiTemps = minutesAdditionnellesDeuxiemeMiTemps;
    }
}