package org.example.dao;

import org.example.model.Voiture;

import java.util.List;

public interface IDaoVoiture {

    void createVoiture(Voiture v );

    Voiture findById(int id);

    void removeVoiture(Voiture v);

    List<Voiture> findAllCarsByDefaultCouleur();

    List<Voiture> findAllCarsByCouleur(String couleur);
}
