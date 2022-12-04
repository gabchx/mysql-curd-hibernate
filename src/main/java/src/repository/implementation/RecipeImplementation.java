package src.repository.implementation;

import src.model.Recipe;
import src.repository.RecipeRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class RecipeImplementation implements RecipeRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Recipe recipe) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(recipe);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Recipe> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Recipe> recipe = session.createQuery("FROM Recipe", Recipe.class).getResultList();
        transaction.commit();
        session.close();

        return recipe;
    }

    @Override
    public Recipe getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Recipe recipe = session.get(Recipe.class, id);
        transaction.commit();
        session.close();

        return recipe;
    }

    @Override
    public void update(Long id, Recipe recipe) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(recipe);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Recipe recipe = session.get(Recipe.class, id);
        session.remove(recipe);
        transaction.commit();
        session.close();
    }
}
