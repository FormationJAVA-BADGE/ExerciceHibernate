package org.example;

import org.example.model.Voiture;
import org.example.service.IVoitureService;
import org.example.service.VoitureServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Voiture voiture=new Voiture("Twingo");

        IVoitureService  service=new VoitureServiceImpl();
        service.createVoiture(voiture);
    }
}