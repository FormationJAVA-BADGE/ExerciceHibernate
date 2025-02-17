package org.example.dao;

import org.example.model.Voiture;

public class DaoVoitureImpl implements IDaoVoiture{


    @Override
    public void createVoiture(Voiture voiture) {
        System.out.println("J'enregistre en bdd la voiture "+ voiture.getModele());
    }
}
