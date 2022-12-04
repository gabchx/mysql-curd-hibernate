package src.controller;

import src.model.Recipe;
import src.repository.RecipeRepository;
import src.repository.implementation.RecipeImplementation;

import java.util.List;

public class RecipeController {
    private RecipeRepository repository = new RecipeImplementation();

    public List<Recipe> printAll() {

        return repository.getAll();
    }

    public void addRecipe(Recipe newRecipe) {
        repository.add(newRecipe);
    }

    public void deleteRecipe(Long index) {
        repository.deleteById(index);
    }

    public void updateRecipe(Long id, Recipe updateRecipe) {
        repository.update(id, updateRecipe);
    }

    public Recipe getValueByIndex(Long index) {

        return repository.getById(index);
    }
}