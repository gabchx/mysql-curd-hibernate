package src.repository.implementation;

import src.model.Employee;
import src.repository.EmployeeRepository;
import src.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class EmployeeImplementation implements EmployeeRepository {
    private Session session;
    private Transaction transaction;

    @Override
    public void add(Employee employee) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
    }

    @Override
    public List<Employee> getAll() {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        List<Employee> employee = session.createQuery("FROM Employee", Employee.class).getResultList();
        transaction.commit();
        session.close();

        return employee;
    }

    @Override
    public Employee getById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        transaction.commit();
        session.close();

        return employee;
    }

    @Override
    public void update(Long id, Employee employee) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.saveOrUpdate(employee);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteById(Long id) {
        session = HibernateSession.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        session.remove(employee);
        transaction.commit();
        session.close();
    }
}
