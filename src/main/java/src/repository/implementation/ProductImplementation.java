package src.repository.implementation;

import src.model.Product;
import src.repository.ProductRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ProductImplementation implements ProductRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Product product) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Product> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Product> product = session.createQuery("FROM Product", Product.class).getResultList();
        transaction.commit();
        session.close();

        return product;
    }

    @Override
    public Product getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Product product = session.get(Product.class, id);
        transaction.commit();
        session.close();

        return product;
    }

    @Override
    public void update(Long id, Product product) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(product);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Product product = session.get(Product.class, id);
        session.remove(product);
        transaction.commit();
        session.close();
    }
}
