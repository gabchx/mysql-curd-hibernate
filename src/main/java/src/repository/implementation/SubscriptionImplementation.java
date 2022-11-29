package src.repository.implementation;

import src.model.Subscription;
import src.repository.SubscriptionRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class SubscriptionImplementation implements SubscriptionRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Subscription subscription) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(subscription);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Subscription> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Subscription> subscription = session.createQuery("FROM Subscription", Subscription.class).getResultList();
        transaction.commit();
        session.close();

        return subscription;
    }

    @Override
    public Subscription getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Subscription subscription = session.get(Subscription.class, id);
        transaction.commit();
        session.close();

        return subscription;
    }

    @Override
    public void update(Long id, Subscription subscription) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(subscription);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Subscription subscription = session.get(Subscription.class, id);
        session.remove(subscription);
        transaction.commit();
        session.close();
    }
}
