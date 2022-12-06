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

        i = 2;
        Employee e2 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p2 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl2 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c2 = new Computers(p2, e2, 04102022, cl2);
        computersctrl.addComputers(c2);

        i = 3;
        Employee e3 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p3 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl3 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c3 = new Computers(p3, e3, 12022022, cl3);
        computersctrl.addComputers(c3);

        i = 4;
        Employee e4 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p4 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl4 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c4 = new Computers(p4, e4, 28122022, cl4);
        computersctrl.addComputers(c4);

        i = 5;
        Employee e5 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p5 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl5 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c5 = new Computers(p5, e5, 13062022, cl5);
        computersctrl.addComputers(c5);

        i = 6;
        Employee e6 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p6= placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl6 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c6 = new Computers(p6, e6, 14112022, cl6);
        computersctrl.addComputers(c6);

        i = 7;
        Employee e7 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p7 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl7= cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c7 = new Computers(p7, e7, 16122022, cl7);
        computersctrl.addComputers(c7);

        i = 8;
        Employee e8 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p8 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl8 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c8 = new Computers(p8, e8, 01012022, cl8);
        computersctrl.addComputers(c8);

        i = 9;
        Employee e9 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p9 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl9 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c9 = new Computers(p9, e9, 28082022, cl9);
        computersctrl.addComputers(c9);

        i = 10;
        Employee e10 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Place p10 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Components_list cl10 = cpnlsctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Computers c10 = new Computers(p10, e10, 15092022, cl10);
        computersctrl.addComputers(c10);
    };
}
