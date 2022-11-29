package src.seeding;

import src.model.Employee;
import src.model.Employee_history;
import src.model.Place;
import src.model.Timeslot;

public class Seeding {
    public static void seedAllTable() {
        CustomerSeeding.seed();
        PlaceSeeding.seed();
        TimeslotSeeding.seed();
        EmployeeSeeding.seed();
        //Employee_historySeeding.seed();
        System.out.println("Seeding complete!");
    };
}
