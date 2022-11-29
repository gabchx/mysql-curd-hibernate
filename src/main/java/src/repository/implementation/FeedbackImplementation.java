package src.repository.implementation;

import src.model.Feedback;
import src.repository.FeedbackRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class FeedbackImplementation implements FeedbackRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Feedback feedback) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(feedback);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Feedback> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Feedback> feedback = session.createQuery("FROM Feedback", Feedback.class).getResultList();
        transaction.commit();
        session.close();

        return feedback;
    }

    @Override
    public Feedback getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Feedback feedback = session.get(Feedback.class, id);
        transaction.commit();
        session.close();

        return feedback;
    }

    @Override
    public void update(Long id, Feedback feedback) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(feedback);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Feedback feedback = session.get(Feedback.class, id);
        session.remove(feedback);
        transaction.commit();
        session.close();
    }
}
