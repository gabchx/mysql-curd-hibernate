package src.seeding;

import src.controller.*;
import src.model.*;

public class RecipeSeeding {

    public static void seed() {
        RecipeController recipectrl = new RecipeController();
        Recipe r1 = new Recipe("furnace", 90, "300°C");
        recipectrl.addRecipe(r1);
    };
}
