package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.LocalDateTime;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory=HibernateConfig.getSessionFactory();

        sessionFactory.inTransaction(
                (session )-> {
            session.persist(new Event("Our very first event!", LocalDateTime.now()));
            session.persist(new Event("A follow up event", LocalDateTime.now()));
        });



       Session session=sessionFactory.openSession();
       session.beginTransaction();
       session.persist(new Event("Our very first event!", LocalDateTime.now()));
       session.persist(new Event("Our very first event!", LocalDateTime.now()));
       session.getTransaction().commit();
       session.close();


        Session session2=sessionFactory.openSession();
        Event event=session2.find(Event.class,id);

       Event ev=new Event("A follow up event (update)", LocalDateTime.now());
       ev.setId(3L);
       session.merge(ev);



    }
}