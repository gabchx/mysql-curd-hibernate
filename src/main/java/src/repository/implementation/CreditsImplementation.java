package src.repository.implementation;

import src.model.Credits;
import src.repository.CreditsRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class CreditsImplementation implements CreditsRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Credits credits) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(credits);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Credits> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Credits> credits = session.createQuery("FROM Credits", Credits.class).getResultList();
        transaction.commit();
        session.close();

        return credits;
    }

    @Override
    public Credits getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Credits credits = session.get(Credits.class, id);
        transaction.commit();
        session.close();

        return credits;
    }

    @Override
    public void update(Long id, Credits credits) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(credits);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Credits credits = session.get(Credits.class, id);
        session.remove(credits);
        transaction.commit();
        session.close();
    }
}
