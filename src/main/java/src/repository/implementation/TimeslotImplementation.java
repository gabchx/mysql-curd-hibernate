package src.repository.implementation;

import src.model.Timeslot;
import src.repository.TimeslotRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class TimeslotImplementation implements TimeslotRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Timeslot timeslot) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(timeslot);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Timeslot> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Timeslot> timeslot = session.createQuery("FROM Timeslot", Timeslot.class).getResultList();
        transaction.commit();
        session.close();

        return timeslot;
    }

    @Override
    public Timeslot getById(String id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Timeslot timeslot = session.get(Timeslot.class, id);
        transaction.commit();
        session.close();

        return timeslot;
    }

    @Override
    public void update(String id, Timeslot timeslot) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(timeslot);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(String id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Timeslot timeslot = session.get(Timeslot.class, id);
        session.remove(timeslot);
        transaction.commit();
        session.close();
    }
}
