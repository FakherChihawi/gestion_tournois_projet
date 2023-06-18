package com.example.gestion_tournois.DAOs;
import com.example.gestion_tournois.Entity.Equipe;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class EquipeDAOImpl implements EquipeDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void createEquipe(Equipe equipe) {
        entityManager.persist(equipe);
    }

    @Override
    public Equipe getEquipeById(Long id) {
        return entityManager.find(Equipe.class, id);
    }

    @Override
    public List<Equipe> getAllEquipes() {
        return entityManager.createQuery("SELECT e FROM Equipe e", Equipe.class)
                .getResultList();
    }

    @Override
    public void updateEquipe(Equipe equipe) {
        entityManager.merge(equipe);
    }

    @Override
    public void deleteEquipe(Equipe equipe) {
        entityManager.remove(equipe);
    }
}
