package org.example.dao;

import jakarta.persistence.Query;
import org.example.model.Voiture;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class DaoVoitureImpl implements IDaoVoiture {
    @Override
    public void createVoiture(Voiture v) {
        SessionFactory sessionFactory=DaoFactory.getSessionFactory();

        sessionFactory.inTransaction((session)-> session.persist(v));
    }

    @Override
    public Voiture findById(int id) {
        SessionFactory sessionFactory=DaoFactory.getSessionFactory();
        Session session=sessionFactory.openSession();
        Voiture voiture=session.find(Voiture.class, id);
        session.close();
        return voiture;
    }

    @Override
    public void removeVoiture(Voiture v) {
        SessionFactory sessionFactory=DaoFactory.getSessionFactory();
        sessionFactory.inTransaction((session)-> session.remove(v));
    }

    @Override
    public List<Voiture> findAllCarsByDefaultCouleur() {
        SessionFactory sessionFactory=DaoFactory.getSessionFactory();
        Session session= sessionFactory.openSession();

        Query query=session.createQuery("select v from Voiture v where v.couleur=:defaultCouleur", Voiture.class);
        query.setParameter("defaultCouleur","blanc");
        List<Voiture> results= query.getResultList();
        session.close();
        return results;
    }

    @Override
    public List<Voiture> findAllCarsByCouleur(String couleur) {
        SessionFactory sessionFactory=DaoFactory.getSessionFactory();
        Session session= sessionFactory.openSession();
        Query query=session.createQuery("select v from Voiture v where v.couleur=:couleur", Voiture.class);
        query.setParameter("couleur",couleur);
        List<Voiture> results= query.getResultList();
        session.close();
        return results;
    }
}
