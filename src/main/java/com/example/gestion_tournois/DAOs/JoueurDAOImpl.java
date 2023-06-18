package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.Joueur;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class JoueurDAOImpl implements JoueurDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createJoueur(Joueur joueur) {
        entityManager.persist(joueur);
    }

    @Override
    public Joueur getJoueurById(Long id) {
        return entityManager.find(Joueur.class, id);
    }

    @Override
    public List<Joueur> getAllJoueurs() {
        return entityManager.createQuery("SELECT j FROM Joueur j", Joueur.class)
                .getResultList();
    }

    @Override
    public void updateJoueur(Joueur joueur) {
        entityManager.merge(joueur);
    }

    @Override
    public void deleteJoueur(Joueur joueur) {
        entityManager.remove(joueur);
    }
}
