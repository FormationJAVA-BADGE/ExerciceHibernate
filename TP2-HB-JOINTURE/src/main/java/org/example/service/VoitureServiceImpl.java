package org.example.service;

import org.example.dao.DaoFactory;
import org.example.dao.IDaoVoiture;
import org.example.model.Voiture;

import java.util.List;

public class VoitureServiceImpl implements IVoitureService {
    @Override
    public void createVoiture(Voiture v) {
        if(v.getCouleur().length()>2){
            IDaoVoiture dao= DaoFactory.createDaoVoiture();
            dao.createVoiture(v);
        }
    }

    @Override
    public Voiture findById(int id) {
        return null;
    }

    @Override
    public void removeVoiture(Voiture v) {

    }

    @Override
    public List<Voiture> findAllCarsByDefaultCouleur() {
        IDaoVoiture dao= DaoFactory.createDaoVoiture();
        return dao.findAllCarsByDefaultCouleur();
    }

    @Override
    public List<Voiture> findAllCarsByCouleur(String couleur) {
        IDaoVoiture dao= DaoFactory.createDaoVoiture();
        return dao.findAllCarsByCouleur(couleur);
    }
}
