package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Changement;
import com.example.gestion_tournois.Entity.MatchFoot;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ChangementDAOImpl implements ChangementDAO {
    private EntityManager entityManager;

    public ChangementDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void ajouterChangement(Changement changement) {
        entityManager.getTransaction().begin();
        entityManager.persist(changement);
        entityManager.getTransaction().commit();
    }

    @Override
    public void supprimerChangement(Changement changement) {
        entityManager.getTransaction().begin();
        entityManager.remove(changement);
        entityManager.getTransaction().commit();
    }

    @Override
    public Changement getChangementById(int id) {
        return entityManager.find(Changement.class, id);
    }

    @Override
    public List<Changement> getChangementsByMatch(MatchFoot match) {
        Query query = entityManager.createQuery("SELECT c FROM Changement c WHERE c.match = :match");
        query.setParameter("match", match.getId());
        return query.getResultList();
    }

    @Override
    public List<Changement> getAllChangements() {
        Query query = entityManager.createQuery("SELECT c FROM Changement c");
        return query.getResultList();
    }
}
