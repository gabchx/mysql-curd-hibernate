package src.seeding;

import src.controller.Employee_historyController;
import src.model.Employee_history;

public class Employee_historySeeding {

    public static void seed() {
        Employee_historyController employee_historyctrl = new Employee_historyController();
        Employee_history eh1 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh1);
    };
}
