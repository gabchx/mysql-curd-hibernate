package src.repository.implementation;

import src.model.Subscribe;
import src.repository.SubscribeRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class SubscribeImplementation implements SubscribeRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Subscribe subscribe) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(subscribe);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Subscribe> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Subscribe> subscribe = session.createQuery("FROM Subscribe", Subscribe.class).getResultList();
        transaction.commit();
        session.close();

        return subscribe;
    }

    @Override
    public Subscribe getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Subscribe subscribe = session.get(Subscribe.class, id);
        transaction.commit();
        session.close();

        return subscribe;
    }

    @Override
    public void update(Long id, Subscribe subscribe) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(subscribe);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Subscribe subscribe = session.get(Subscribe.class, id);
        session.remove(subscribe);
        transaction.commit();
        session.close();
    }
}
