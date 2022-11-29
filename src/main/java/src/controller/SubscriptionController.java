package src.controller;

import src.model.Subscription;
import src.repository.SubscriptionRepository;
import src.repository.implementation.SubscriptionImplementation;

import java.util.List;

public class SubscriptionController {
    private SubscriptionRepository repository = new SubscriptionImplementation();

    public List<Subscription> printAll() {

        return repository.getAll();
    }

    public void addSubscription(Subscription newSubscription) {
        repository.add(newSubscription);
    }

    public void deleteSubscription(Long index) {
        repository.deleteById(index);
    }

    public void updateSubscription(Long id, Subscription updateSubscription) {
        repository.update(id, updateSubscription);
    }

    public Subscription getValueByIndex(Long index) {

        return repository.getById(index);
    }
}