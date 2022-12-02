package src.repository.implementation;

import src.model.Fix;
import src.repository.FixRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class FixImplementation implements FixRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Fix fix) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(fix);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Fix> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Fix> fix = session.createQuery("FROM Fix", Fix.class).getResultList();
        transaction.commit();
        session.close();

        return fix;
    }

    @Override
    public Fix getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Fix fix = session.get(Fix.class, id);
        transaction.commit();
        session.close();

        return fix;
    }

    @Override
    public void update(Long id, Fix fix) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(fix);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Fix fix = session.get(Fix.class, id);
        session.remove(fix);
        transaction.commit();
        session.close();
    }
}
