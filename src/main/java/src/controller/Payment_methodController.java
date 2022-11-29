package src.controller;

import src.model.Payment_method;
import src.repository.Payment_methodRepository;
import src.repository.implementation.Payment_methodImplementation;

import java.util.List;

public class Payment_methodController {
    private Payment_methodRepository repository = new Payment_methodImplementation();

    public List<Payment_method> printAll() {

        return repository.getAll();
    }

    public void addPayment_method(Payment_method newPayment_method) {
        repository.add(newPayment_method);
    }

    public void deletePayment_method(Long index) {
        repository.deleteById(index);
    }

    public void updatePayment_method(Long id, Payment_method updatePayment_method) {
        repository.update(id, updatePayment_method);
    }

    public Payment_method getValueByIndex(Long index) {

        return repository.getById(index);
    }
}