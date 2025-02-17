package org.example.service;

public class ServiceFactory {

    public static IVoitureService createVoitureService(){
        return new VoitureServiceImpl();
    }
    public static IMarqueService createMarqueService(){
        return new MarqueServiceImpl();
    }

}
