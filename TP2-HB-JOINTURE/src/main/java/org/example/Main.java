package org.example;

import org.example.model.Marque;
import org.example.model.Voiture;
import org.example.service.IMarqueService;
import org.example.service.ServiceFactory;
import org.example.service.IVoitureService;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Marque renault=new Marque("Renault");
        IMarqueService marqueService=ServiceFactory.createMarqueService();
        marqueService.createMarque(renault);

        Voiture voiture=new Voiture();
        voiture.setCouleur("rouge");
        voiture.setModele("clio");
        voiture.setMarque(renault);
        IVoitureService voitureService=ServiceFactory.createVoitureService();
        voitureService.createVoiture(voiture);


        for(int i=0; i<10;i++){
            Voiture v=new Voiture();
            v.setCouleur("blanc");
            v.setModele("clio");
            v.setMarque(renault);
            voitureService.createVoiture(v);
        }

        for(int i=0; i<20;i++){
            Voiture v=new Voiture();
            v.setCouleur("vert");
            v.setModele("twingo");
            v.setMarque(renault);
            voitureService.createVoiture(v);
        }

        List<Voiture> voituresVertes=voitureService.findAllCarsByCouleur("vert");

        System.out.println("LES VOITURES VERTES "+voituresVertes.size());

        List<Voiture> voituresBlanc=voitureService.findAllCarsByDefaultCouleur();

        System.out.println("LES VOITURES BLANCHES "+voituresBlanc.size());

    }
}