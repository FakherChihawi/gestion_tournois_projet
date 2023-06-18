package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Buteur;

import java.util.List;

public interface ButeurDAO {
    void createButeur(Buteur buteur);
    Buteur getButeurById(int buteurId);
    List<Buteur> getAllButeurs();
    void updateButeur(Buteur buteur);
    void deleteButeur(Buteur buteur);
}