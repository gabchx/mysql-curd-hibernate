package src.seeding;

import src.controller.*;
import src.model.*;

public class ComponentSeeding {

    public static void seed() {
        ComponentController componentctrl = new ComponentController();
        PlaceController placectrl = new PlaceController();
        Integer i;

        i = 1;
        Place p1 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Component c1 = new Component(p1, "ok", "screen", 18, 48000);
        componentctrl.addComponent(c1);

        i = 2;
        Place p2 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Component c2 = new Component(p2, "ok", "keyboard", 25, 28000);
        componentctrl.addComponent(c2);
        i = 3;
        Place p3 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Component c3 = new Component(p3, "ok", "mouse", 55, 8900);
        componentctrl.addComponent(c3);
        i = 4;
        Place p4 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Component c4 = new Component(p4, "ok", "headphone", 32, 23000);
        componentctrl.addComponent(c4);
        i =5;
        Place p5 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Component c5 = new Component(p5, "ok", "tower", 19, 45000);
        componentctrl.addComponent(c5);
    };
}
