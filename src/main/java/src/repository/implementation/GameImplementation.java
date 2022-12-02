package src.repository.implementation;

import src.model.Game;
import src.repository.GameRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class GameImplementation implements GameRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Game game) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(game);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Game> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Game> game = session.createQuery("FROM Game", Game.class).getResultList();
        transaction.commit();
        session.close();

        return game;
    }

    @Override
    public Game getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Game game = session.get(Game.class, id);
        transaction.commit();
        session.close();

        return game;
    }

    @Override
    public void update(Long id, Game game) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(game);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Game game = session.get(Game.class, id);
        session.remove(game);
        transaction.commit();
        session.close();
    }
}
