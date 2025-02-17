package org.example.service;

import org.example.model.Voiture;

import java.util.List;

public interface IVoitureService {
    void createVoiture(Voiture v );

    Voiture findById(int id);

    void removeVoiture(Voiture v);

    List<Voiture> findAllCarsByDefaultCouleur();

    List<Voiture> findAllCarsByCouleur(String couleur);

}
