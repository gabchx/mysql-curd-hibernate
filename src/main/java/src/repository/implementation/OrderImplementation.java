package src.repository.implementation;

import src.model.Order;
import src.repository.OrderRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class OrderImplementation implements OrderRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Order order) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Order> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Order> order = session.createQuery("FROM Order", Order.class).getResultList();
        transaction.commit();
        session.close();

        return order;
    }

    @Override
    public Order getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Order order = session.get(Order.class, id);
        transaction.commit();
        session.close();

        return order;
    }

    @Override
    public void update(Long id, Order order) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(order);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Order order = session.get(Order.class, id);
        session.remove(order);
        transaction.commit();
        session.close();
    }
}
