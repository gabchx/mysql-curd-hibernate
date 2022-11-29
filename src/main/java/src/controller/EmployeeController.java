package src.controller;

import src.model.Employee;
import src.repository.EmployeeRepository;
import src.repository.implementation.EmployeeImplementation;

import java.util.List;

public class EmployeeController {
    private EmployeeRepository repository = new EmployeeImplementation();

    public List<Employee> printAll() {

        return repository.getAll();
    }

    public void addEmployee(Employee newEmployee) {
        repository.add(newEmployee);
    }

    public void deleteEmployee(Long index) {
        repository.deleteById(index);
    }

    public void updateEmployee(Long id, Employee updateEmployee) {
        repository.update(id, updateEmployee);
    }

    public Employee getValueByIndex(Long index) {

        return repository.getById(index);
    }
}