package src.seeding;

import src.controller.CreditsController;
import src.controller.CustomerController;
import src.controller.Payment_methodController;
import src.controller.TopupController;
import src.model.Credits;
import src.model.Customer;
import src.model.Payment_method;
import src.model.Topup;
import java.util.Date;

public class TopupSeeding {

    public static void seed() {
        TopupController topupctrl = new TopupController();
        CustomerController custctrl = new CustomerController();
        CreditsController credctrl = new CreditsController();
        Payment_methodController payctrl = new Payment_methodController();
        Integer i;

        i=1;
        Customer c1 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd1 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=2;
        Payment_method p1 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d1 = new Date(2002,02,21);
        Topup t1 = new Topup(c1,cd1,d1,p1,"none");
        topupctrl.addTopup(t1);
    };
}
