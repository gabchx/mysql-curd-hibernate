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
    };
}
