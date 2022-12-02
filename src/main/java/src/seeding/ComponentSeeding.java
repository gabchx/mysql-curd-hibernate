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

        Component c1 = new Component(p1, "ok", "screen", 1, 40000);
        componentctrl.addComponent(c1);
        Component c2 = new Component(p1, "ok", "keyboard", 1, 40000);
        componentctrl.addComponent(c1);
        Component c3 = new Component(p1, "ok", "mouse", 1, 40000);
        componentctrl.addComponent(c1);
        Component c4 = new Component(p1, "ok", "headphone", 1, 40000);
        componentctrl.addComponent(c1);
        Component c5 = new Component(p1, "ok", "tower", 1, 40000);
        componentctrl.addComponent(c1);
    };
}
