package src.repository.implementation;

import src.model.Place;
import src.repository.PlaceRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class PlaceImplementation implements PlaceRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Place place) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(place);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Place> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Place> place = session.createQuery("FROM Place", Place.class).getResultList();
        transaction.commit();
        session.close();

        return place;
    }

    @Override
    public Place getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Place place = session.get(Place.class, id);
        transaction.commit();
        session.close();

        return place;
    }

    @Override
    public void update(Long id, Place place) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(place);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Place place = session.get(Place.class, id);
        session.remove(place);
        transaction.commit();
        session.close();
    }
}
