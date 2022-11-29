package src.controller;

import src.model.Connection_method;
import src.repository.Connection_methodsRepository;
import src.repository.implementation.Connection_methodsImplementation;

import java.util.List;

public class Connection_methodController {
    private Connection_methodsRepository repository = new Connection_methodsImplementation();

    public List<Connection_method> printAll() {

        return repository.getAll();
    }

    public void addConnection_method(Connection_method newConnection_method) {
        repository.add(newConnection_method);
    }

    public void deleteConnection_method(Long index) {
        repository.deleteById(index);
    }

    public void updateConnection_method(Long id, Connection_method updateConnection_method) {
        repository.update(id, updateConnection_method);
    }

    public Connection_method getValueByIndex(Long index) {

        return repository.getById(index);
    }
}