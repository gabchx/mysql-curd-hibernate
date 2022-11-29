package src.repository.implementation;

import src.model.Topup;
import src.repository.TopupRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class TopupImplementation implements TopupRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Topup topup) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(topup);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Topup> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Topup> topup = session.createQuery("FROM Topup", Topup.class).getResultList();
        transaction.commit();
        session.close();

        return topup;
    }

    @Override
    public Topup getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Topup topup = session.get(Topup.class, id);
        transaction.commit();
        session.close();

        return topup;
    }

    @Override
    public void update(Long id, Topup topup) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(topup);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Topup topup = session.get(Topup.class, id);
        session.remove(topup);
        transaction.commit();
        session.close();
    }
}
