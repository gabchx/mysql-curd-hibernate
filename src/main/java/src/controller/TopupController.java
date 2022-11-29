package src.controller;

import src.model.Topup;
import src.repository.TopupRepository;
import src.repository.implementation.TopupImplementation;

import java.util.List;

public class TopupController {
    private TopupRepository repository = new TopupImplementation();

    public List<Topup> printAll() {

        return repository.getAll();
    }

    public void addTopup(Topup newTopup) {
        repository.add(newTopup);
    }

    public void deleteTopup(Long index) {
        repository.deleteById(index);
    }

    public void updateTopup(Long id, Topup updateTopup) {
        repository.update(id, updateTopup);
    }

    public Topup getValueByIndex(Long index) {

        return repository.getById(index);
    }
}