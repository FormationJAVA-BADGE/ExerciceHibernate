package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConfig {
      static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory(){
       if(sessionFactory==null) {
           final StandardServiceRegistry registry =
                   new StandardServiceRegistryBuilder()
                           .build();
           try {
               sessionFactory =
                       new MetadataSources(registry)
                               .addAnnotatedClass(Event.class)
                               .buildMetadata()
                               .buildSessionFactory();
           } catch (Exception e) {
               // The registry would be destroyed by the SessionFactory, but we
               // had trouble building the SessionFactory so destroy it manually.
               StandardServiceRegistryBuilder.destroy(registry);
           }
       }
       return sessionFactory;
    }
}
