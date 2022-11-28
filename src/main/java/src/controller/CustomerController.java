package src.controller;

import src.model.Customer;
import src.repository.CustomerRepository;
import src.repository.implementation.CustomerImplementation;

import java.util.List;

public class CustomerController {
    private CustomerRepository repository = new CustomerImplementation();

    public List<Customer> printAll() {

        return repository.getAll();
    }

    public void addCustomer(Customer newCustomer) {
        repository.add(newCustomer);
    }

    public void deleteCustomer(Long index) {
        repository.deleteById(index);
    }

    public void updateCustomer(Long id, Customer updateCustomer) {
        repository.update(id, updateCustomer);
    }

    public Customer getValueByIndex(Long index) {

        return repository.getById(index);
    }
}