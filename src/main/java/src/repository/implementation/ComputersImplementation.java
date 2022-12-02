package src.repository.implementation;

import src.model.Computers;
import src.repository.ComputersRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ComputersImplementation implements ComputersRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Computers computers) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(computers);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Computers> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Computers> computers = session.createQuery("FROM Computers", Computers.class).getResultList();
        transaction.commit();
        session.close();

        return computers;
    }

    @Override
    public Computers getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Computers computers = session.get(Computers.class, id);
        transaction.commit();
        session.close();

        return computers;
    }

    @Override
    public void update(Long id, Computers computers) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(computers);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Computers computers = session.get(Computers.class, id);
        session.remove(computers);
        transaction.commit();
        session.close();
    }
}
