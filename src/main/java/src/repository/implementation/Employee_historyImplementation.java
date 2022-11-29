package src.repository.implementation;

import src.model.Employee_history;
import src.repository.Employee_historyRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class Employee_historyImplementation implements Employee_historyRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Employee_history employee_history) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(employee_history);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Employee_history> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Employee_history> employee_history = session.createQuery("FROM Employee_history", Employee_history.class)
                .getResultList();
        transaction.commit();
        session.close();

        return employee_history;
    }

    @Override
    public Employee_history getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Employee_history employee_history = session.get(Employee_history.class, id);
        transaction.commit();
        session.close();

        return employee_history;
    }

    @Override
    public void update(Long id, Employee_history employee_history) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(employee_history);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Employee_history employee_history = session.get(Employee_history.class, id);
        session.remove(employee_history);
        transaction.commit();
        session.close();
    }
}
