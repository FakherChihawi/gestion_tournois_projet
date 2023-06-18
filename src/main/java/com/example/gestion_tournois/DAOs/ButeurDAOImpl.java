package com.example.gestion_tournois.DAOs;


import com.example.gestion_tournois.Entity.Buteur;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class ButeurDAOImpl implements ButeurDAO {
    private EntityManager entityManager;

    public ButeurDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void createButeur(Buteur buteur) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(buteur);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Buteur getButeurById(int buteurId) {
        return entityManager.find(Buteur.class, buteurId);
    }

    @Override
    public List<Buteur> getAllButeurs() {
        TypedQuery<Buteur> query = entityManager.createQuery("SELECT b FROM Buteur b", Buteur.class);
        return query.getResultList();
    }

    @Override
    public void updateButeur(Buteur buteur) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(buteur);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteButeur(Buteur buteur) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(buteur);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}