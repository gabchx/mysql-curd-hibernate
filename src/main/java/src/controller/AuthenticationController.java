package src.controller;

import src.model.Authentication;
import src.repository.AuthenticationRepository;
import src.repository.implementation.AuthenticationImplementation;

import java.util.List;

public class AuthenticationController {
    private AuthenticationRepository repository = new AuthenticationImplementation();

    public List<Authentication> printAll() {

        return repository.getAll();
    }

    public void addAuthentication(Authentication newAuthentication) {
        repository.add(newAuthentication);
    }

    public void deleteAuthentication(String index) {
        repository.deleteById(index);
    }

    public void updateAuthentication(String id, Authentication updateAuthentication) {
        repository.update(id, updateAuthentication);
    }

    public Authentication getValueByIndex(String index) {

        return repository.getById(index);
    }
}