package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Avertissement;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class AvertissementDAOImpl implements AvertissementDAO {
    private EntityManager entityManager;

    public AvertissementDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void createAvertissement(Avertissement avertissement) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(avertissement);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Avertissement getAvertissementById(int avertissementId) {
        return entityManager.find(Avertissement.class, avertissementId);
    }

    @Override
    public List<Avertissement> getAllAvertissements() {
        TypedQuery<Avertissement> query = entityManager.createQuery("SELECT a FROM Avertissement a", Avertissement.class);
        return query.getResultList();
    }

    @Override
    public void updateAvertissement(Avertissement avertissement) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.merge(avertissement);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAvertissement(Avertissement avertissement) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.remove(avertissement);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}