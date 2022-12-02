package src.seeding;

import src.controller.*;
import src.model.*;

public class ConnectionSeeding {

    public static void seed() {
        ConnectionController connectionctrl = new ConnectionController();
        ComputersController computersctrl = new ComputersController();
        CustomerController cstctrl = new CustomerController();
        Connection_methodController cmctrl = new Connection_methodController();
        FeedbackController fctrl = new FeedbackController();

        Integer i;

        i = 1;
        Customer cst1 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt1 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Connection_method cm1 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f1 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx1 = new Connection(cst1,cpt1, cm1, 123, f1);
        connectionctrl.addConnection(cnx1);
    };
}
