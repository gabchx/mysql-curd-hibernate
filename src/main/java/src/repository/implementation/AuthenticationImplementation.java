package src.repository.implementation;

import src.model.Authentication;
import src.repository.AuthenticationRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class AuthenticationImplementation implements AuthenticationRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Authentication authentication) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(authentication);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Authentication> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Authentication> authentication = session.createQuery("FROM Authentication", Authentication.class).getResultList();
        transaction.commit();
        session.close();

        return authentication;
    }

    @Override
    public Authentication getById(String id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Authentication authentication= session.get(Authentication.class, id);
        transaction.commit();
        session.close();

        return authentication;
    }

    @Override
    public void update(String id, Authentication authentication ){
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(authentication);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(String id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Authentication authentication= session.get(Authentication.class, id);
        session.remove(authentication);
        transaction.commit();
        session.close();
    }
}
