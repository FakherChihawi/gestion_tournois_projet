package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.MatchFoot;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MatchDAOImpl implements MatchDAO {
    private EntityManager entityManager;

    public MatchDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void ajouterMatch(MatchFoot match) {
        entityManager.getTransaction().begin();
        entityManager.persist(match);
        entityManager.getTransaction().commit();
    }

    @Override
    public void supprimerMatch(MatchFoot match) {
        entityManager.getTransaction().begin();
        entityManager.remove(match);
        entityManager.getTransaction().commit();
    }

    @Override
    public MatchFoot getMatchById(int id) {
        return entityManager.find(MatchFoot.class, id);
    }

    @Override
    public List<MatchFoot> getAllMatchs() {
        Query query = entityManager.createQuery("SELECT m FROM MatchFoot m");
        return query.getResultList();
    }
}
