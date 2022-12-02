package src.repository.implementation;

import src.model.Component;
import src.repository.ComponentRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ComponentImplementation implements ComponentRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Component component) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(component);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Component> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Component> component = session.createQuery("FROM Component", Component.class).getResultList();
        transaction.commit();
        session.close();

        return component;
    }

    @Override
    public Component getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Component component = session.get(Component.class, id);
        transaction.commit();
        session.close();

        return component;
    }

    @Override
    public void update(Long id, Component component) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(component);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Component component = session.get(Component.class, id);
        session.remove(component);
        transaction.commit();
        session.close();
    }
}
