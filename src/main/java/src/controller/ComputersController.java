package src.controller;

import src.model.Computers;
import src.repository.ComputersRepository;
import src.repository.implementation.ComputersImplementation;

import java.util.List;

public class ComputersController {
    private ComputersRepository repository = new ComputersImplementation();

    public List<Computers> printAll() {

        return repository.getAll();
    }

    public void addComputers(Computers newComputers) {
        repository.add(newComputers);
    }

    public void deleteComputers(Long index) {
        repository.deleteById(index);
    }

    public void updateComputers(Long id, Computers updateComputers) {
        repository.update(id, updateComputers);
    }

    public Computers getValueByIndex(Long index) {

        return repository.getById(index);
    }
}