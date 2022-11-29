package src.controller;

import src.model.Place;
import src.repository.PlaceRepository;
import src.repository.implementation.PlaceImplementation;

import java.util.List;

public class PlaceController {
    private PlaceRepository repository = new PlaceImplementation();

    public List<Place> printAll() {

        return repository.getAll();
    }

    public void addPlace(Place newPlace) {
        repository.add(newPlace);
    }

    public void deletePlace(Long index) {
        repository.deleteById(index);
    }

    public void updatePlace(Long id, Place updatePlace) {
        repository.update(id, updatePlace);
    }

    public Place getValueByIndex(Long index) {

        return repository.getById(index);
    }
}