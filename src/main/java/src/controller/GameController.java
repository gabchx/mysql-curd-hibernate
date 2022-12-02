package src.controller;

import src.model.Game;
import src.repository.GameRepository;
import src.repository.implementation.GameImplementation;

import java.util.List;

public class GameController {
    private GameRepository repository = new GameImplementation();

    public List<Game> printAll() {

        return repository.getAll();
    }

    public void addGame(Game newGame) {
        repository.add(newGame);
    }

    public void deleteGame(Long index) {
        repository.deleteById(index);
    }

    public void updateGame(Long id, Game updateGame) {
        repository.update(id, updateGame);
    }

    public Game getValueByIndex(Long index) {

        return repository.getById(index);
    }
}