package src.seeding;

import src.controller.*;
import src.model.*;

public class FixSeeding {

    public static void seed() {
        FixController fixctrl = new FixController();
        ComputersController computersctrl = new ComputersController();
        EmployeeController empctrl = new EmployeeController();

        Integer i;

        i = 4;
        Employee e1 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 1;
        Computers c1 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f1 = new Fix(c1, e1, "little fix", "ram card cleaning");
        fixctrl.addFix(f1);

        i = 4;
        Employee e2 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 1;
        Computers c2 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f2 = new Fix(c2, e2, "little fix", "key E not working, changed");
        fixctrl.addFix(f2);

        i = 4;
        Employee e3 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 2;
        Computers c3 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f3 = new Fix(c3, e3, "little fix", "screen freeze");
        fixctrl.addFix(f3);

        i = 4;
        Employee e4 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 1;
        Computers c4 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f4 = new Fix(c4, e4, "little fix", "weird noise");
        fixctrl.addFix(f4);

        i = 4;
        Employee e5 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 3;
        Computers c5 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f5 = new Fix(c5, e5, "big fix", "change of tower");
        fixctrl.addFix(f5);

        i = 7;
        Employee e6 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 5;
        Computers c6 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f6 = new Fix(c6, e6, "little fix", "sound stopped");
        fixctrl.addFix(f6);

        i = 7;
        Employee e7 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 6;
        Computers c7 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f7 = new Fix(c7, e7, "big fix", "broken screen");
        fixctrl.addFix(f7);

        i = 7;
        Employee e8 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 6;
        Computers c8 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f8 = new Fix(c8, e8, "big  fix", "usb port defected");
        fixctrl.addFix(f8);

        i = 7;
        Employee e9 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 8;
        Computers c9 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f9 = new Fix(c9, e9, "little fix", "headphones problem");
        fixctrl.addFix(f9);

        i = 3;
        Employee e10 = empctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 9;
        Computers c10 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Fix f10 = new Fix(c10, e10, "little fix", "mouse off and on");
        fixctrl.addFix(f10);


    };
}