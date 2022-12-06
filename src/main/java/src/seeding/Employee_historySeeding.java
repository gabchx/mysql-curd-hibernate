package src.seeding;

import src.controller.Employee_historyController;
import src.model.Employee_history;

public class Employee_historySeeding {

    public static void seed() {
        Employee_historyController employee_historyctrl = new Employee_historyController();
        Employee_history eh1 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh1);
        Employee_history eh2 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh2);
        Employee_history eh3 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh3);
        Employee_history eh4 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh4);
        Employee_history eh5 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh5);
        Employee_history eh6 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh6);
        Employee_history eh7 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh7);
        Employee_history eh8 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh8);
        Employee_history eh9 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh9);
        Employee_history eh10 = new Employee_history();
        employee_historyctrl.addEmployee_history(eh10);
    };
}

