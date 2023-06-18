package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.MatchFoot;

import java.util.List;

public interface MatchDAO {
    void ajouterMatch(MatchFoot match);
    void supprimerMatch(MatchFoot match);
    MatchFoot getMatchById(int id);
    List<MatchFoot> getAllMatchs();
}
