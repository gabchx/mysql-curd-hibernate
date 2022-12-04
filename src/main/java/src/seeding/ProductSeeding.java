package src.seeding;

import src.controller.*;
import src.model.*;

public class ProductSeeding {

    public static void seed() {
        ProductController productctrl = new ProductController();
        PlaceController placectrl = new PlaceController();
        RecipeController recipectrl = new RecipeController();
        Integer i;

        i = 1;
        Place p1 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r1 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr1 = new Product(p1, "dessert", r1, "18", 3000, "Creme Flambée");
        productctrl.addProduct(pr1);
    };
}
