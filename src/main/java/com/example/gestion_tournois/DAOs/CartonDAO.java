package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Carton;
import com.example.gestion_tournois.Entity.Joueur;
import com.example.gestion_tournois.Entity.MatchFoot;

import java.util.List;

public interface CartonDAO {
    void ajouterCarton(Carton carton);
    void supprimerCarton(Carton carton);
    Carton getCartonById(int id);
    List<Carton> getCartonsByJoueur(Joueur joueur);
    List<Carton> getCartonsByMatch(MatchFoot match);
    List<Carton> getAllCartons();
}