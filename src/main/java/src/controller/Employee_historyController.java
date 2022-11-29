package src.controller;

import src.model.Employee_history;
import src.repository.Employee_historyRepository;
import src.repository.implementation.Employee_historyImplementation;

import java.util.List;

public class Employee_historyController {
    private Employee_historyRepository repository = new Employee_historyImplementation();

    public List<Employee_history> printAll() {

        return repository.getAll();
    }

    public void addEmployee_history(Employee_history newEmployee_history) {
        repository.add(newEmployee_history);
    }

    public void deleteEmployee_history(Long index) {
        repository.deleteById(index);
    }

    public void updateEmployee_history(Long id, Employee_history updateEmployee_history) {
        repository.update(id, updateEmployee_history);
    }

    public Employee_history getValueByIndex(Long index) {

        return repository.getById(index);
    }
}