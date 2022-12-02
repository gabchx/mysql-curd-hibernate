package src.controller;

import src.model.Connection;
import src.repository.ConnectionRepository;
import src.repository.implementation.ConnectionImplementation;

import java.util.List;

public class ConnectionController {
    private ConnectionRepository repository = new ConnectionImplementation();

    public List<Connection> printAll() {

        return repository.getAll();
    }

    public void addConnection(Connection newConnection) {
        repository.add(newConnection);
    }

    public void deleteConnection(Long index) {
        repository.deleteById(index);
    }

    public void updateConnection(Long id, Connection updateConnection) {
        repository.update(id, updateConnection);
    }

    public Connection getValueByIndex(Long index) {

        return repository.getById(index);
    }
}