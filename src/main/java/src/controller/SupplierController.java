package src.controller;

import src.model.Supplier;
import src.repository.SupplierRepository;
import src.repository.implementation.SupplierImplementation;

import java.util.List;

public class SupplierController {
    private SupplierRepository repository = new SupplierImplementation();

    public List<Supplier> printAll() {

        return repository.getAll();
    }

    public void addSupplier(Supplier newSupplier) {
        repository.add(newSupplier);
    }

    public void deleteSupplier(Long index) {
        repository.deleteById(index);
    }

    public void updateSupplier(Long id, Supplier updateSupplier) {
        repository.update(id, updateSupplier);
    }

    public Supplier getValueByIndex(Long index) {

        return repository.getById(index);
    }
}