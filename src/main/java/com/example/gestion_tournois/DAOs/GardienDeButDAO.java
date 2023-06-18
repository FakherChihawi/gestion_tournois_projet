package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.GardienDeBut;

import java.util.List;

public interface GardienDeButDAO {
    void ajouterGardienDeBut(GardienDeBut gardienDeBut);
    void supprimerGardienDeBut(GardienDeBut gardienDeBut);
    GardienDeBut getGardienDeButById(int id);
    List<GardienDeBut> getAllGardiensDeBut();
}
