package src.seeding;

import src.controller.PlaceController;
import src.model.Place;

public class PlaceSeeding {

    public static void seed() {
        PlaceController Placectrl = new PlaceController();

        Place p1 = new Place("PCB1","4 Westminster Stree, London", "good");
        Placectrl.addPlace(p1);

        Place p2 = new Place("PCHong","5 Yeonhui-ro, Seodaemun-gu, Seoul", "nice");
        Placectrl.addPlace(p2);

        Place p3 = new Place("HelloBang","20 rue du Petit Prince, Meudon", "medium");
        Placectrl.addPlace(p3);

        Place p4 = new Place("PCBangMe","50 rue des moules, Chatenay-Malabry", "ok");
        Placectrl.addPlace(p4);

        Place p5 = new Place("BangBangLove","69 Theresa Street, New York", "bad");
        Placectrl.addPlace(p5);

        Place p6 = new Place("PCYOU","45 Halmilton Boulevard, Toronto", "cringe");
        Placectrl.addPlace(p6);

        Place p7 = new Place("GAMESbang","8 WochenArt StraBe, Dresden", "good");
        Placectrl.addPlace(p7);

        Place p8 = new Place("PChome","12 Lilipucia road, Virginia", "ok");
        Placectrl.addPlace(p8);

        Place p9 = new Place("PC12345","56 Einstein Street, Budapest", "best");
        Placectrl.addPlace(p9);

        Place p10 = new Place("PCBANGOriginal","15 marc-ro, Busan", "fantastic");
        Placectrl.addPlace(p10);
    };
}
