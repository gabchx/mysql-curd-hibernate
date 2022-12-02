package src.seeding;

import src.controller.*;
import src.model.*;

public class GameSeeding {

    public static void seed() {
        GameController gamectrl = new GameController();
        PlaceController placectrl = new PlaceController();
        Integer i;

        i = 1;
        Place p1 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c1 = new Game("Fortnite", "none", "fps", p1, true);
        gamectrl.addGame(c1);
    };
}
