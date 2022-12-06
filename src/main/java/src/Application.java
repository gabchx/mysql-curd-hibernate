package src;
import org.hibernate.Session;
import src.bdextra.StoreProcedure;
import src.bdextra.Trigger;
import src.util.Connector;
import src.view.View;
import src.seeding.Seeding;
import src.util.HibernateSession;

import java.io.Console;

//TO NOT GET DELETE OR UPDATE ERRORS PLEASE SET : /*SET GLOBAL FOREIGN_KEY_CHECKS=0;*/

public class Application {
    public static void main(String[] args) {

        System.err.close();
        System.setErr(System.out);

        //Test connection
        Connector C = new Connector("localhost","pcbang-chain",3306);
        boolean conected = C.Connect("javapp","azerty123&é\"");
        while(conected){
            System.out.println("Test session established. ");

            //Build Tables
            Session session = HibernateSession.getSessionFactory().openSession();

            //Seeding
            Seeding.seedAllTable();

            //Create Triggers
            System.out.println(Trigger.create());

            //Create Store Procedure
            System.out.println(StoreProcedure.create());
            new View().show();
        }
    }
}
