package src.controller;

import src.model.Fix;
import src.repository.FixRepository;
import src.repository.implementation.FixImplementation;

import java.util.List;

public class FixController {
    private FixRepository repository = new FixImplementation();

    public List<Fix> printAll() {

        return repository.getAll();
    }

    public void addFix(Fix newFix) {
        repository.add(newFix);
    }

    public void deleteFix(Long index) {
        repository.deleteById(index);
    }

    public void updateFix(Long id, Fix updateFix) {
        repository.update(id, updateFix);
    }

    public Fix getValueByIndex(Long index) {

        return repository.getById(index);
    }
}