package src.controller;

import src.model.Serve;
import src.repository.ServeRepository;
import src.repository.implementation.ServeImplementation;

import java.util.List;

public class ServeController {
    private ServeRepository repository = new ServeImplementation();

    public List<Serve> printAll() {

        return repository.getAll();
    }

    public void addServe(Serve newServe) {
        repository.add(newServe);
    }

    public void deleteServe(Long index) {
        repository.deleteById(index);
    }

    public void updateServe(Long id, Serve updateServe) {
        repository.update(id, updateServe);
    }

    public Serve getValueByIndex(Long index) {

        return repository.getById(index);
    }
}