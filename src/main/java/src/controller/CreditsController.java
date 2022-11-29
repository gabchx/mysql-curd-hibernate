package src.controller;

import src.model.Credits;
import src.repository.CreditsRepository;
import src.repository.implementation.CreditsImplementation;

import java.util.List;

public class CreditsController {
    private CreditsRepository repository = new CreditsImplementation();

    public List<Credits> printAll() {

        return repository.getAll();
    }

    public void addCredits(Credits newCredits) {
        repository.add(newCredits);
    }

    public void deleteCredits(Long index) {
        repository.deleteById(index);
    }

    public void updateCredits(Long id, Credits updateCredits) {
        repository.update(id, updateCredits);
    }

    public Credits getValueByIndex(Long index) {

        return repository.getById(index);
    }
}