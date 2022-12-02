package src.repository.implementation;

import src.model.Warning_message;
import src.repository.Warning_messageRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class Warning_messageImplementation implements Warning_messageRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Warning_message warning_message) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(warning_message);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Warning_message> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Warning_message> warning_message = session.createQuery("FROM Warning_message", Warning_message.class)
                .getResultList();
        transaction.commit();
        session.close();

        return warning_message;
    }

    @Override
    public Warning_message getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Warning_message warning_message = session.get(Warning_message.class, id);
        transaction.commit();
        session.close();

        return warning_message;
    }

    @Override
    public void update(Long id, Warning_message warning_message) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(warning_message);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Warning_message warning_message = session.get(Warning_message.class, id);
        session.remove(warning_message);
        transaction.commit();
        session.close();
    }
}
