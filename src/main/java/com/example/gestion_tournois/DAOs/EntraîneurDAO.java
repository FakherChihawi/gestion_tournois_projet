package com.example.gestion_tournois.DAOs;
import com.example.gestion_tournois.Entity.Entraîneur;
import java.util.List;

public interface EntraîneurDAO {
    void createEntraîneur(Entraîneur entraîneur);
    Entraîneur getEntraîneurById(Long id);
    List<Entraîneur> getAllEntraîneurs();
    void updateEntraîneur(Entraîneur entraîneur);
    void deleteEntraîneur(Entraîneur entraîneur);
}


