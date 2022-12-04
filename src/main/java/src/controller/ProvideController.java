package src.controller;

import src.model.Provide;
import src.repository.ProvideRepository;
import src.repository.implementation.ProvideImplementation;

import java.util.List;

public class ProvideController {
    private ProvideRepository repository = new ProvideImplementation();

    public List<Provide> printAll() {

        return repository.getAll();
    }

    public void addProvide(Provide newProvide) {
        repository.add(newProvide);
    }

    public void deleteProvide(Long index) {
        repository.deleteById(index);
    }

    public void updateProvide(Long id, Provide updateProvide) {
        repository.update(id, updateProvide);
    }

    public Provide getValueByIndex(Long index) {

        return repository.getById(index);
    }
}