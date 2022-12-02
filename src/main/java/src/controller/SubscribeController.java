package src.controller;

import src.model.Subscribe;
import src.repository.SubscribeRepository;
import src.repository.implementation.SubscribeImplementation;

import java.util.List;

public class SubscribeController {
    private SubscribeRepository repository = new SubscribeImplementation();

    public List<Subscribe> printAll() {

        return repository.getAll();
    }

    public void addSubscribe(Subscribe newSubscribe) {
        repository.add(newSubscribe);
    }

    public void deleteSubscribe(Long index) {
        repository.deleteById(index);
    }

    public void updateSubscribe(Long id, Subscribe updateSubscribe) {
        repository.update(id, updateSubscribe);
    }

    public Subscribe getValueByIndex(Long index) {

        return repository.getById(index);
    }
}