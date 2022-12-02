package src.controller;

import src.model.Components_list;
import src.repository.Components_listRepository;
import src.repository.implementation.Components_listImplementation;

import java.util.List;

public class Components_listController {
    private Components_listRepository repository = new Components_listImplementation();

    public List<Components_list> printAll() {

        return repository.getAll();
    }

    public void addComponents_list(Components_list newComponents_list) {
        repository.add(newComponents_list);
    }

    public void deleteComponents_list(Long index) {
        repository.deleteById(index);
    }

    public void updateComponents_list(Long id, Components_list updateComponents_list) {
        repository.update(id, updateComponents_list);
    }

    public Components_list getValueByIndex(Long index) {

        return repository.getById(index);
    }
}