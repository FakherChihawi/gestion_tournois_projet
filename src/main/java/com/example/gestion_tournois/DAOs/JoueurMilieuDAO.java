package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.JoueurMilieu;

import java.util.List;

public interface JoueurMilieuDAO {
    void ajouterJoueurMilieu(JoueurMilieu joueurMilieu);
    void supprimerJoueurMilieu(JoueurMilieu joueurMilieu);
    JoueurMilieu getJoueurMilieuById(int id);
    List<JoueurMilieu> getAllJoueursMilieu();
}