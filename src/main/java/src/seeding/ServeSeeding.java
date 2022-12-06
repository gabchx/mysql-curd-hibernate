package src.seeding;

import src.controller.*;
import src.model.*;

public class ServeSeeding {

    public static void seed() {
        ServeController servectrl = new ServeController();
        BillingController bilingctrl = new BillingController();
        EmployeeController emplctrl = new EmployeeController();
        FeedbackController fedctrl = new FeedbackController();

        Integer i;

        i = 1;
        Employee e1 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b1 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f1 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s1 = new Serve(b1, e1, f1);
        servectrl.addServe(s1);
        i = 2;
        Employee e2 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b2 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f2 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s2 = new Serve(b2, e2, f2);
        servectrl.addServe(s2);
        i = 3;
        Employee e3 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b3 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f3 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s3 = new Serve(b3, e3, f3);
        servectrl.addServe(s3);
        i = 4;
        Employee e4 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b4 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f4 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s4 = new Serve(b4, e4, f4);
        servectrl.addServe(s4);
        i = 5;
        Employee e5 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b5 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f5 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s5 = new Serve(b5, e5, f5);
        servectrl.addServe(s5);
        i = 6;
        Employee e6 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b6 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f6 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s6 = new Serve(b6, e6, f6);
        servectrl.addServe(s6);
        i = 7;
        Employee e7 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b7 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f7 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s7 = new Serve(b7, e7, f7);
        servectrl.addServe(s7);
        i = 8;
        Employee e8 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b8 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f8 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s8 = new Serve(b8, e8, f8);
        servectrl.addServe(s8);
        i = 9;
        Employee e9 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b9 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f9 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s9 = new Serve(b9, e9, f9);
        servectrl.addServe(s9);
        i = 10;
        Employee e10 = emplctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b10 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f10 = fedctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Serve s10 = new Serve(b10, e10, f10);
        servectrl.addServe(s10);
    };
}
