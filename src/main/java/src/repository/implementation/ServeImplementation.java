package src.repository.implementation;

import src.model.Serve;
import src.repository.ServeRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ServeImplementation implements ServeRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Serve serve) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(serve);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Serve> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Serve> serve = session.createQuery("FROM Serve", Serve.class).getResultList();
        transaction.commit();
        session.close();

        return serve;
    }

    @Override
    public Serve getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Serve serve = session.get(Serve.class, id);
        transaction.commit();
        session.close();

        return serve;
    }

    @Override
    public void update(Long id, Serve serve) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(serve);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Serve serve = session.get(Serve.class, id);
        session.remove(serve);
        transaction.commit();
        session.close();
    }
}
