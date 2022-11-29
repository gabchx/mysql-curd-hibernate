package src.controller;

import src.model.Timeslot;
import src.repository.TimeslotRepository;
import src.repository.implementation.TimeslotImplementation;

import java.util.List;

public class TimeslotController {
    private TimeslotRepository repository = new TimeslotImplementation();

    public List<Timeslot> printAll() {

        return repository.getAll();
    }

    public void addTimeslot(Timeslot newTimeslot) {
        repository.add(newTimeslot);
    }

    public void deleteTimeslot(String index) {
        repository.deleteById(index);
    }

    public void updateTimeslot(String id, Timeslot updateTimeslot) {
        repository.update(id, updateTimeslot);
    }

    public Timeslot getValueByIndex(String index) {

        return repository.getById(index);
    }
}