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
        i = 2;
        Place p2 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c2 = new Game("Resident Evil", "none", "fps", p2, true);
        gamectrl.addGame(c2);
        i = 3;
        Place p3 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c3 = new Game("Minecraft", "none", "gameplay", p3, true);
        gamectrl.addGame(c3);
        i = 4;
        Place p4 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c4 = new Game("Splatoon", "none", "group game", p4, true);
        gamectrl.addGame(c4);
        i = 5;
        Place p5 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c5 = new Game("Final Fantasy IV", "none", "fps", p5, true);
        gamectrl.addGame(c5);
        i = 6;
        Place p6 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c6 = new Game("Black Book", "none", "fps", p6, true);
        gamectrl.addGame(c6);
        i = 7;
        Place p7 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c7 = new Game("Halo Infinite", "none", "fps", p7, true);
        gamectrl.addGame(c7);
        i = 8;
        Place p8 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c8 = new Game("The Medium", "none", "gameplay", p8, true);
        gamectrl.addGame(c8);
        i = 9;
        Place p9 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c9 = new Game("Humankind", "none", "fps", p9, true);
        gamectrl.addGame(c9);
        i = 10;
        Place p10 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));

        Game c10 = new Game("Demeo", "none", "fps", p10, true);
        gamectrl.addGame(c10);
    };
}
