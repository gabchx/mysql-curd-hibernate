package src.seeding;

import src.controller.*;
import src.model.*;
import java.util.Date;

public class BillingSeeding {

    public static void seed() {
        BillingController bilingctrl = new BillingController();
        Payment_methodController payctrl = new Payment_methodController();
        Integer i;

        i = 1;
        Payment_method p1 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d1 = new Date(2002, 02, 21);
        Billing b1 = new Billing(4000,"",p1,"none",d1);
        bilingctrl.addBiling(b1);
    };
}
