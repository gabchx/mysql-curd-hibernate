package src.repository.implementation;

import src.model.Payment_method;
import src.repository.Payment_methodRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class Payment_methodImplementation implements Payment_methodRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Payment_method payment_method) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(payment_method);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Payment_method> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Payment_method> payment_method = session.createQuery("FROM Payment_method", Payment_method.class)
                .getResultList();
        transaction.commit();
        session.close();

        return payment_method;
    }

    @Override
    public Payment_method getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Payment_method payment_method = session.get(Payment_method.class, id);
        transaction.commit();
        session.close();

        return payment_method;
    }

    @Override
    public void update(Long id, Payment_method payment_method) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(payment_method);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Payment_method payment_method = session.get(Payment_method.class, id);
        session.remove(payment_method);
        transaction.commit();
        session.close();
    }
}
