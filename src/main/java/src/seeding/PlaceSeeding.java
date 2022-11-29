package src.seeding;

import src.controller.PlaceController;
import src.model.Place;

public class PlaceSeeding {

    public static void seed() {
        PlaceController Placectrl = new PlaceController();
        Place p1 = new Place("PCB1","4 Westminster Stree, London", "good");
        Placectrl.addPlace(p1);
    };
}
