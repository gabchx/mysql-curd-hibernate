package src.repository.implementation;

import src.model.Customer;
import src.repository.CustomerRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class CustomerImplementation implements CustomerRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Customer customer) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Customer> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Customer> customer = session.createQuery("FROM Customer", Customer.class).getResultList();
        transaction.commit();
        session.close();

        return customer;
    }

    @Override
    public Customer getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Customer customer= session.get(Customer.class, id);
        transaction.commit();
        session.close();

        return customer;
    }

    @Override
    public void update(Long id, Customer customer ){
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(customer);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Customer customer= session.get(Customer.class, id);
        session.remove(customer);
        transaction.commit();
        session.close();
    }
}
