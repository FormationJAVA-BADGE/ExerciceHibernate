package org.example.dao;

public class DaoFactory {


    public static IDaoVoiture createDaoVoiture(){
        return new DaoVoitureImpl();
    }
}
