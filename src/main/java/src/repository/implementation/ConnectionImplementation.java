package src.repository.implementation;

import src.model.Connection;
import src.repository.ConnectionRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ConnectionImplementation implements ConnectionRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Connection connection) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(connection);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Connection> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Connection> connection = session.createQuery("FROM Connection", Connection.class).getResultList();
        transaction.commit();
        session.close();

        return connection;
    }

    @Override
    public Connection getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Connection connection = session.get(Connection.class, id);
        transaction.commit();
        session.close();

        return connection;
    }

    @Override
    public void update(Long id, Connection connection) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(connection);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Connection connection = session.get(Connection.class, id);
        session.remove(connection);
        transaction.commit();
        session.close();
    }
}
