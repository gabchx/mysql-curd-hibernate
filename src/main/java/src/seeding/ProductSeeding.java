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

        i = 2;
        Place p2 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r2 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr2 = new Product(p2, "dessert", r2, "0", 3000, "Ice Cream");
        productctrl.addProduct(pr2);

        i = 3;
        Place p3 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r3 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr3 = new Product(p3, "Ramen", r3, "0", 3000, "Spicy Ramen");
        productctrl.addProduct(pr3);

        i = 4;
        Place p4 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r4 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr4 = new Product(p4, "Ramen", r4, "0", 3000, "chicken ramen");
        productctrl.addProduct(pr4);

        i = 5;
        Place p5 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r5 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr5 = new Product(p5, "snack", r5, "0", 3000, "Chips");
        productctrl.addProduct(pr5);

        i = 6;
        Place p6 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r6 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr6 = new Product(p6, "snack", r6, "0", 3000, "Peperro");
        productctrl.addProduct(pr6);

        i = 7;
        Place p7 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r7 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr7 = new Product(p7, "dessert", r7, "0", 3000, "Brownie");
        productctrl.addProduct(pr7);

        i = 8;
        Place p8 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r8 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr8 = new Product(p8, "dessert", r8, "0", 3000, "Cookie");
        productctrl.addProduct(pr8);

        i = 9;
        Place p9 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r9 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr9 = new Product(p9, "Sides", r9, "0", 3000, "Rice");
        productctrl.addProduct(pr9);

        i = 10;
        Place p10= placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Recipe r10 = recipectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr10 = new Product(p10, "Alcohol", r10, "19", 3000, "Bier");
        productctrl.addProduct(pr10);


    };
}
