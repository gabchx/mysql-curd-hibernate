package src.controller;

import src.model.User_request;
import src.repository.User_requestRepository;
import src.repository.implementation.User_requestImplementation;

import java.util.List;

public class User_requestController {
    private User_requestRepository repository = new User_requestImplementation();

    public List<User_request> printAll() {

        return repository.getAll();
    }

    public void addUser_request(User_request newUser_request) {
        repository.add(newUser_request);
    }

    public void deleteUser_request(Long index) {
        repository.deleteById(index);
    }

    public void updateUser_request(Long id, User_request updateUser_request) {
        repository.update(id, updateUser_request);
    }

    public User_request getValueByIndex(Long index) {

        return repository.getById(index);
    }
}