package src.repository.implementation;

import src.model.Provide;
import src.repository.ProvideRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ProvideImplementation implements ProvideRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Provide provide) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(provide);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Provide> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Provide> provide = session.createQuery("FROM Provide", Provide.class).getResultList();
        transaction.commit();
        session.close();

        return provide;
    }

    @Override
    public Provide getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Provide provide = session.get(Provide.class, id);
        transaction.commit();
        session.close();

        return provide;
    }

    @Override
    public void update(Long id, Provide provide) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(provide);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Provide provide = session.get(Provide.class, id);
        session.remove(provide);
        transaction.commit();
        session.close();
    }
}
