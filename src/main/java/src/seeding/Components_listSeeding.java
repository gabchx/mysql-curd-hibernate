package src.seeding;

import src.controller.*;
import src.model.*;

public class Components_listSeeding {

    public static void seed() {
        Components_listController components_listctrl = new Components_listController();
        ComponentController cmpctrl = new ComponentController();

        Integer i;

        i = 1;
        Component s1 = cmpctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 2;
        Component m1 = cmpctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 3;
        Component k1 = cmpctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 4;
        Component h1 = cmpctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 5;
        Component t1 = cmpctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Components_list cl1 = new Components_list(s1, k1, m1, h1, t1);
        components_listctrl.addComponents_list(cl1);
    };
}
