package com.example.gestion_tournois.DAOs;
import com.example.gestion_tournois.Entity.Equipe;

import java.util.List;

public interface EquipeDAO {
    void createEquipe(Equipe equipe);
    Equipe getEquipeById(Long id);
    List<Equipe> getAllEquipes();
    void updateEquipe(Equipe equipe);
    void deleteEquipe(Equipe equipe);
}
