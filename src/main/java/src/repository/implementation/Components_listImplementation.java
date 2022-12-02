package src.repository.implementation;

import src.model.Components_list;
import src.repository.Components_listRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class Components_listImplementation implements Components_listRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Components_list components_list) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(components_list);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Components_list> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Components_list> components_list = session.createQuery("FROM Components_list", Components_list.class)
                .getResultList();
        transaction.commit();
        session.close();

        return components_list;
    }

    @Override
    public Components_list getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Components_list components_list = session.get(Components_list.class, id);
        transaction.commit();
        session.close();

        return components_list;
    }

    @Override
    public void update(Long id, Components_list components_list) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(components_list);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Components_list components_list = session.get(Components_list.class, id);
        session.remove(components_list);
        transaction.commit();
        session.close();
    }
}
