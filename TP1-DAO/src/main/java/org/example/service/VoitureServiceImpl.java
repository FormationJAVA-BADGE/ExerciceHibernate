package org.example.service;

import org.example.dao.DaoFactory;
import org.example.dao.DaoVoitureImpl;
import org.example.dao.IDaoVoiture;
import org.example.model.Voiture;

public class VoitureServiceImpl implements IVoitureService{
    @Override
    public void createVoiture(Voiture voiture) {

        System.out.println("la voiture est ok du point de vue métier");
        IDaoVoiture daoVoiture= new DaoVoitureImpl();
        daoVoiture.createVoiture(voiture);
    }
}
