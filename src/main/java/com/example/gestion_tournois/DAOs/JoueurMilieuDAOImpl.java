package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.JoueurMilieu;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JoueurMilieuDAOImpl implements JoueurMilieuDAO {
    private EntityManager entityManager;

    public JoueurMilieuDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void ajouterJoueurMilieu(JoueurMilieu joueurMilieu) {
        entityManager.getTransaction().begin();
        entityManager.persist(joueurMilieu);
        entityManager.getTransaction().commit();
    }

    @Override
    public void supprimerJoueurMilieu(JoueurMilieu joueurMilieu) {
        entityManager.getTransaction().begin();
        entityManager.remove(joueurMilieu);
        entityManager.getTransaction().commit();
    }

    @Override
    public JoueurMilieu getJoueurMilieuById(int id) {
        return entityManager.find(JoueurMilieu.class, id);
    }

    @Override
    public List<JoueurMilieu> getAllJoueursMilieu() {
        Query query = entityManager.createQuery("SELECT j FROM JoueurMilieu j");
        return query.getResultList();
    }
}
