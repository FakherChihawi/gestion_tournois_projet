package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Carton;
import com.example.gestion_tournois.Entity.Joueur;
import com.example.gestion_tournois.Entity.MatchFoot;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CartonDAOImpl implements CartonDAO {
    private EntityManager entityManager;

    public CartonDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void ajouterCarton(Carton carton) {
        entityManager.getTransaction().begin();
        entityManager.persist(carton);
        entityManager.getTransaction().commit();
    }

    @Override
    public void supprimerCarton(Carton carton) {
        entityManager.getTransaction().begin();
        entityManager.remove(carton);
        entityManager.getTransaction().commit();
    }

    @Override
    public Carton getCartonById(int id) {
        return entityManager.find(Carton.class, id);
    }

    @Override
    public List<Carton> getCartonsByJoueur(Joueur joueur) {
        Query query = entityManager.createQuery("SELECT c FROM Carton c WHERE c.joueur = :joueur");
        query.setParameter("joueur", joueur);
        return query.getResultList();
    }

    @Override
    public List<Carton> getCartonsByMatch(MatchFoot match) {
        Query query = entityManager.createQuery("SELECT c FROM Carton c WHERE c.match = :match");
        query.setParameter("match", match);
        return query.getResultList();
    }

    @Override
    public List<Carton> getAllCartons() {
        Query query = entityManager.createQuery("SELECT c FROM Carton c");
        return query.getResultList();
    }
}
