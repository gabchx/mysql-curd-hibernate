package src.controller;

import src.model.Component;
import src.repository.ComponentRepository;
import src.repository.implementation.ComponentImplementation;

import java.util.List;

public class ComponentController {
    private ComponentRepository repository = new ComponentImplementation();

    public List<Component> printAll() {

        return repository.getAll();
    }

    public void addComponent(Component newComponent) {
        repository.add(newComponent);
    }

    public void deleteComponent(Long index) {
        repository.deleteById(index);
    }

    public void updateComponent(Long id, Component updateComponent) {
        repository.update(id, updateComponent);
    }

    public Component getValueByIndex(Long index) {

        return repository.getById(index);
    }
}