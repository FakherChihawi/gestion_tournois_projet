package com.example.gestion_tournois.DAOs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.example.gestion_tournois.Entity.Entraîneur;

public class EntraîneurDAOImpl implements EntraîneurDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createEntraîneur(Entraîneur entraîneur) {
        entityManager.persist(entraîneur);
    }

    @Override
    public Entraîneur getEntraîneurById(Long id) {
        return entityManager.find(Entraîneur.class, id);
    }

    @Override
    public List<Entraîneur> getAllEntraîneurs() {
        return entityManager.createQuery("SELECT e FROM Entraîneur e", Entraîneur.class)
                .getResultList();
    }

    @Override
    public void updateEntraîneur(Entraîneur entraîneur) {
        entityManager.merge(entraîneur);
    }

    @Override
    public void deleteEntraîneur(Entraîneur entraîneur) {
        entityManager.remove(entraîneur);
    }
}
