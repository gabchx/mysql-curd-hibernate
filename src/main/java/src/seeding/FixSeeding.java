package src.seeding;

import src.controller.*;
import src.model.*;

public class FixSeeding {

    public static void seed() {
        FixController fixctrl = new FixController();
        ComputersController computersctrl = new ComputersController();
        EmployeeController empctrl = new EmployeeController();

        Integer i;

        i = 1;
        Employee e1 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers c1 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f1 = new Fix(c1, e1, "litle fix", "ram card cleaning");
        fixctrl.addFix(f1);
    };
}
