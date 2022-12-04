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
    };
}
