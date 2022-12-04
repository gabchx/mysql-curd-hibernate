package src.repository.implementation;

import src.model.Billing;
import src.repository.BillingRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class BillingImplementation implements BillingRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Billing billing) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(billing);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Billing> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Billing> billing = session.createQuery("FROM Biling", Billing.class).getResultList();
        transaction.commit();
        session.close();

        return billing;
    }

    @Override
    public Billing getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Billing billing = session.get(Billing.class, id);
        transaction.commit();
        session.close();

        return billing;
    }

    @Override
    public void update(Long id, Billing billing) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(billing);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Billing billing = session.get(Billing.class, id);
        session.remove(billing);
        transaction.commit();
        session.close();
    }
}
