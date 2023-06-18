package com.example.gestion_tournois.DAOs;

import com.example.gestion_tournois.Entity.GardienDeBut;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class GardienDeButDAOImpl implements GardienDeButDAO {
    private EntityManager entityManager;

    public GardienDeButDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void ajouterGardienDeBut(GardienDeBut gardienDeBut) {
        entityManager.getTransaction().begin();
        entityManager.persist(gardienDeBut);
        entityManager.getTransaction().commit();
    }

    @Override
    public void supprimerGardienDeBut(GardienDeBut gardienDeBut) {
        entityManager.getTransaction().begin();
        entityManager.remove(gardienDeBut);
        entityManager.getTransaction().commit();
    }

    @Override
    public GardienDeBut getGardienDeButById(int id) {
        return entityManager.find(GardienDeBut.class, id);
    }

    @Override
    public List<GardienDeBut> getAllGardiensDeBut() {
        Query query = entityManager.createQuery("SELECT g FROM GardienDeBut g");
        return query.getResultList();
    }
}

