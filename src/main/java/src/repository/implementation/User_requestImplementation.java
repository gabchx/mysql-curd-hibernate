package src.repository.implementation;

import src.model.User_request;
import src.repository.User_requestRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class User_requestImplementation implements User_requestRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(User_request user_request) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(user_request);
        transaction.commit();
        session.close();
    }

    @Override
    public List<User_request> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<User_request> user_request = session.createQuery("FROM User_request", User_request.class).getResultList();
        transaction.commit();
        session.close();

        return user_request;
    }

    @Override
    public User_request getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        User_request user_request = session.get(User_request.class, id);
        transaction.commit();
        session.close();

        return user_request;
    }

    @Override
    public void update(Long id, User_request user_request) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(user_request);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        User_request user_request = session.get(User_request.class, id);
        session.remove(user_request);
        transaction.commit();
        session.close();
    }
}
