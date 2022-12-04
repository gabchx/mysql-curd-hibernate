package src.controller;

import src.model.Billing;
import src.repository.BillingRepository;
import src.repository.implementation.BillingImplementation;

import java.util.List;

public class BillingController {
    private BillingRepository repository = new BillingImplementation();

    public List<Billing> printAll() {

        return repository.getAll();
    }

    public void addBiling(Billing newBilling) {
        repository.add(newBilling);
    }

    public void deleteBiling(Long index) {
        repository.deleteById(index);
    }

    public void updateBiling(Long id, Billing updateBilling) {
        repository.update(id, updateBilling);
    }

    public Billing getValueByIndex(Long index) {

        return repository.getById(index);
    }
}