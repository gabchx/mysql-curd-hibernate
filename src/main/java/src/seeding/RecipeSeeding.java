package src.seeding;

import src.controller.*;
import src.model.*;

public class RecipeSeeding {

    public static void seed() {
        RecipeController recipectrl = new RecipeController();
        Recipe r1 = new Recipe("oven", 90, "300°C");
        recipectrl.addRecipe(r1);
        Recipe r2 = new Recipe("microwave", 30, "300W");
        recipectrl.addRecipe(r2);
        Recipe r3 = new Recipe("microwave", 90, "300W");
        recipectrl.addRecipe(r3);
        Recipe r4 = new Recipe("microwave", 120, "300W");
        recipectrl.addRecipe(r4);
        Recipe r5 = new Recipe("microwave", 15, "300W");
        recipectrl.addRecipe(r5);
        Recipe r6 = new Recipe("oven", 950, "125°C");
        recipectrl.addRecipe(r6);
        Recipe r7 = new Recipe("oven", 1250, "280°C");
        recipectrl.addRecipe(r7);
        Recipe r8 = new Recipe("stove", 300, "th9");
        recipectrl.addRecipe(r8);
        Recipe r9 = new Recipe("stove", 90, "th3");
        recipectrl.addRecipe(r9);
        Recipe r10 = new Recipe("stove", 90, "th5");
        recipectrl.addRecipe(r10);
    };
}
