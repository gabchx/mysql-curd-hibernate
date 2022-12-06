package src.seeding;

import src.controller.EmployeeController;
import src.controller.PlaceController;
import src.controller.TimeslotController;
import src.model.Employee;
import src.model.Place;
import src.model.Timeslot;

public class EmployeeSeeding {

    public static void seed() {
        EmployeeController employeectrl = new EmployeeController();
        PlaceController placectrl = new PlaceController();
        TimeslotController tmsctrl = new TimeslotController();
        Integer i;

        i = 1;
        Place p1 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t1 = tmsctrl.getValueByIndex("A");
        Employee e1 = new Employee(p1,"Kim","Cooker","122221",t1);
        employeectrl.addEmployee(e1);

        i = 2;
        Place p2 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t2 = tmsctrl.getValueByIndex("B");
        Employee e2 = new Employee(p2,"Charles","Waiter","80540",t2);
        employeectrl.addEmployee(e2);

        i = 3;
        Place p3 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t3 = tmsctrl.getValueByIndex("C");
        Employee e3 = new Employee(p3,"Lina","Waiter","75687",t3);
        employeectrl.addEmployee(e3);

        i = 5;
        Place p5 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t5 = tmsctrl.getValueByIndex("E");
        Employee e5 = new Employee(p5,"Lee","Technician","105800",t5);
        employeectrl.addEmployee(e5);

        i = 6;
        Place p6 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t6 = tmsctrl.getValueByIndex("F");
        Employee e6 = new Employee(p6,"Marc","Waiter","75687",t6);
        employeectrl.addEmployee(e6);

        i = 7;
        Place p7 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t7 = tmsctrl.getValueByIndex("G");
        Employee e7 = new Employee(p7,"Anna","Cooker","130800",t7);
        employeectrl.addEmployee(e7);

        i = 8;
        Place p8 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t8 = tmsctrl.getValueByIndex("H");
        Employee e8 = new Employee(p8,"Hugo","Technician","120000",t8);
        employeectrl.addEmployee(e8);

        i = 9;
        Place p9 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t9 = tmsctrl.getValueByIndex("I");
        Employee e9 = new Employee(p9,"Sasha","Waiter","110250",t9);
        employeectrl.addEmployee(e9);

        i = 10;
        Place p10 = placectrl.getValueByIndex(Long.valueOf(i.longValue()));
        Timeslot t10 = tmsctrl.getValueByIndex("C");
        Employee e10 = new Employee(p10,"Thomas","Reception manager","130810",t10);
        employeectrl.addEmployee(e10);



    };
}
