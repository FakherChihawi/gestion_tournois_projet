package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Changement;
import com.example.gestion_tournois.Entity.MatchFoot;

import java.util.List;

public interface ChangementDAO {
    void ajouterChangement(Changement changement);
    void supprimerChangement(Changement changement);
    Changement getChangementById(int id);
    List<Changement> getChangementsByMatch(MatchFoot match);
    List<Changement> getAllChangements();
}
