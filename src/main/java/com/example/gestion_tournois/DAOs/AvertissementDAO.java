package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Avertissement;

import java.util.List;

public interface AvertissementDAO {
    void createAvertissement(Avertissement avertissement);
    Avertissement getAvertissementById(int avertissementId);
    List<Avertissement> getAllAvertissements();
    void updateAvertissement(Avertissement avertissement);
    void deleteAvertissement(Avertissement avertissement);
}
