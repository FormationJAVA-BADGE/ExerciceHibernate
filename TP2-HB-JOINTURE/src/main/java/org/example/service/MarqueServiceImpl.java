package org.example.service;

import org.example.dao.DaoFactory;
import org.example.dao.IDaoMarque;
import org.example.model.Marque;

public class MarqueServiceImpl implements IMarqueService {
    @Override
    public void createMarque(Marque m) {

        if(!m.getNom().isEmpty()){
            IDaoMarque dao= DaoFactory.createDaoMarque();
            dao.createMarque(m);
        }

    }
}
