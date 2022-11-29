package src;
import org.hibernate.Session;
import src.util.Connector;
import src.view.View;
import src.seeding.Seeding;
import src.util.HibernateSession;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {

        System.err.close();
        System.setErr(System.out);

        //Build Tables
        Session session = HibernateSession.getSessionFactory().openSession();

        //Seeding
        Seeding.seedAllTable();

        Connector C = new Connector("localhost","pcbang-chain",3306);
        boolean conected = C.Connect("javapp","azerty123&é\"");
        while(conected){
            System.out.println("Test session established. ");
            new View().show();
        }
    }
}
