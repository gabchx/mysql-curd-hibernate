package src.seeding;

import src.controller.TimeslotController;
import src.model.Timeslot;

public class TimeslotSeeding {

    public static void seed() {
        TimeslotController timeslotctrl = new TimeslotController();
        Timeslot t1 = new Timeslot("A","Monday","8AM","4PM");
        timeslotctrl.addTimeslot(t1);
        Timeslot t2 = new Timeslot("B","Monday","4PM","12PM");
        timeslotctrl.addTimeslot(t2);
        Timeslot t3 = new Timeslot("C","Monday","12PM","8AM");
        timeslotctrl.addTimeslot(t3);
        Timeslot t4 = new Timeslot("D","Tuesday","8AM","4PM");
        timeslotctrl.addTimeslot(t4);
        Timeslot t5 = new Timeslot("E","Tuesday","4PM","12PM");
        timeslotctrl.addTimeslot(t5);
        Timeslot t6 = new Timeslot("F","Tuesday","12PM","8AM");
        timeslotctrl.addTimeslot(t6);
        Timeslot t7 = new Timeslot("G","Wednesday","8AM","4PM");
        timeslotctrl.addTimeslot(t7);
        Timeslot t8 = new Timeslot("H","Wednesday","4PM","12PM");
        timeslotctrl.addTimeslot(t8);
        Timeslot t9 = new Timeslot("I","Wednesday","12PM","8AM");
        timeslotctrl.addTimeslot(t9);
        Timeslot t10 = new Timeslot("J","Thursday","8AM","4PM");
        timeslotctrl.addTimeslot(t10);
        Timeslot t11 = new Timeslot("K","Thursday","4PM","12PM");
        timeslotctrl.addTimeslot(t11);
        Timeslot t12 = new Timeslot("L","Thursday","12PM","8AM");
        timeslotctrl.addTimeslot(t12);
        Timeslot t13 = new Timeslot("M","Friday","8AM","4PM");
        timeslotctrl.addTimeslot(t13);
        Timeslot t14 = new Timeslot("N","Friday","4PM","12PM");
        timeslotctrl.addTimeslot(t14);
        Timeslot t15 = new Timeslot("O","Friday","12PM","8AM");
        timeslotctrl.addTimeslot(t15);
        Timeslot t16 = new Timeslot("P","Sunday","8AM","4PM");
        timeslotctrl.addTimeslot(t16);
        Timeslot t17 = new Timeslot("Q","Sunday","4PM","12PM");
        timeslotctrl.addTimeslot(t17);
        Timeslot t18 = new Timeslot("R","Sunday","12PM","8AM");
        timeslotctrl.addTimeslot(t18);
        Timeslot t19 = new Timeslot("S","Saturday","8AM","4PM");
        timeslotctrl.addTimeslot(t19);
        Timeslot t20 = new Timeslot("T","Saturday","4PM","12PM");
        timeslotctrl.addTimeslot(t20);
        Timeslot t21 = new Timeslot("U","Saturday","12PM","8AM");
        timeslotctrl.addTimeslot(t21);
    };
}
