package src.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
    private static final SessionFactory Buildsession = buildSession();

    private static SessionFactory buildSession() {
        try {
            System.err.println("Initial SessionFactory creation sucess ...");
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.err.println("Initial SessionFactory creation failed " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return Buildsession;
    }
}
