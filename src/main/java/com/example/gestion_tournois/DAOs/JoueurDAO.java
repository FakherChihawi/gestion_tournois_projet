package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Joueur;
import java.util.List;

public interface JoueurDAO {
    void createJoueur(Joueur joueur);
    Joueur getJoueurById(Long id);
    List<Joueur> getAllJoueurs();
    void updateJoueur(Joueur joueur);
    void deleteJoueur(Joueur joueur);
}
