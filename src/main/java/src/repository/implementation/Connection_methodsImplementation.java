package src.repository.implementation;

import src.model.Connection_method;
import src.repository.Connection_methodsRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class Connection_methodsImplementation implements Connection_methodsRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Connection_method connection_method) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(connection_method);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Connection_method> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Connection_method> connection_methods = session
                .createQuery("FROM Connection_methods", Connection_method.class).getResultList();
        transaction.commit();
        session.close();

        return connection_methods;
    }

    @Override
    public Connection_method getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Connection_method connection_method = session.get(Connection_method.class, id);
        transaction.commit();
        session.close();

        return connection_method;
    }

    @Override
    public void update(Long id, Connection_method connection_method) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(connection_method);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Connection_method connection_method = session.get(Connection_method.class, id);
        session.remove(connection_method);
        transaction.commit();
        session.close();
    }
}
