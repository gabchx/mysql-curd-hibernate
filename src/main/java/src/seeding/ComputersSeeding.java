package src.seeding;

import src.controller.*;
import src.model.*;

public class ComputersSeeding {

    public static void seed() {
        ComputersController computersctrl = new ComputersController();
        EmployeeController empctrl = new EmployeeController();
        PlaceController placectrl = new PlaceController();
        Components_listController cpnlsctrl = new Components_listController();

        Integer i;

        i = 1;
        Employee e1 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p1 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl1 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c1 = new Computers(p1, e1, 01022012, cl1);
        computersctrl.addComputers(c1);
    };
}
