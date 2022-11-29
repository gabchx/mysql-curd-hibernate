package src.controller;

import src.model.Feedback;
import src.repository.FeedbackRepository;
import src.repository.implementation.FeedbackImplementation;

import java.util.List;

public class FeedbackController {
    private FeedbackRepository repository = new FeedbackImplementation();

    public List<Feedback> printAll() {

        return repository.getAll();
    }

    public void addFeedback(Feedback newFeedback) {
        repository.add(newFeedback);
    }

    public void deleteFeedback(Long index) {
        repository.deleteById(index);
    }

    public void updateFeedback(Long id, Feedback updateFeedback) {
        repository.update(id, updateFeedback);
    }

    public Feedback getValueByIndex(Long index) {

        return repository.getById(index);
    }
}