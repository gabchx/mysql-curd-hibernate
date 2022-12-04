package src.repository.implementation;

import src.model.Supplier;
import src.repository.SupplierRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class SupplierImplementation implements SupplierRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Supplier supplier) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(supplier);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Supplier> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Supplier> supplier = session.createQuery("FROM Supplier", Supplier.class).getResultList();
        transaction.commit();
        session.close();

        return supplier;
    }

    @Override
    public Supplier getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Supplier supplier = session.get(Supplier.class, id);
        transaction.commit();
        session.close();

        return supplier;
    }

    @Override
    public void update(Long id, Supplier supplier) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(supplier);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Supplier supplier = session.get(Supplier.class, id);
        session.remove(supplier);
        transaction.commit();
        session.close();
    }
}
