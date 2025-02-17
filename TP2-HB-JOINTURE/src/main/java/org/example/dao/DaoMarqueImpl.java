package org.example.dao;

import org.example.model.Marque;
import org.hibernate.SessionFactory;

public class DaoMarqueImpl implements IDaoMarque {
    @Override
    public void createMarque(Marque m) {
        SessionFactory sessionFactory=DaoFactory.getSessionFactory();

        sessionFactory.inTransaction((s)->s.persist(m));
    }
}
