package src.controller;

import src.model.Warning_message;
import src.repository.Warning_messageRepository;
import src.repository.implementation.Warning_messageImplementation;

import java.util.List;

public class Warning_messageController {
    private Warning_messageRepository repository = new Warning_messageImplementation();

    public List<Warning_message> printAll() {

        return repository.getAll();
    }

    public void addWarning_message(Warning_message newWarning_message) {
        repository.add(newWarning_message);
    }

    public void deleteWarning_message(Long index) {
        repository.deleteById(index);
    }

    public void updateWarning_message(Long id, Warning_message updateWarning_message) {
        repository.update(id, updateWarning_message);
    }

    public Warning_message getValueByIndex(Long index) {

        return repository.getById(index);
    }
}