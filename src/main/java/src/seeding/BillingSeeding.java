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
        i = 2;
        Payment_method p2 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d2 = new Date(2022, 12, 01);
        Billing b2 = new Billing(40000,"",p2,"none",d2);
        bilingctrl.addBiling(b2);
        i = 3;
        Payment_method p3= payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d3 = new Date(2022, 05, 07);
        Billing b3 = new Billing(25000,"",p3,"none",d3);
        bilingctrl.addBiling(b3);

        i = 4;
        Payment_method p4 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d4 = new Date(2022, 01, 31);
        Billing b4 = new Billing(1000,"",p4,"none",d4);
        bilingctrl.addBiling(b4);
        i = 5;
        Payment_method p5 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d5 = new Date(2018, 11, 19);
        Billing b5 = new Billing(4000,"",p5,"none",d5);
        bilingctrl.addBiling(b5);
        i = 6;
        Payment_method p6 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d6 = new Date(2016, 02, 13);
        Billing b6 = new Billing(3000,"",p6,"none",d6);
        bilingctrl.addBiling(b6);
        i = 7;
        Payment_method p7 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d7 = new Date(2021, 05, 27);
        Billing b7 = new Billing(3300,"700",p7,"none",d7);
        bilingctrl.addBiling(b7);
        i = 8;
        Payment_method p8 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d8 = new Date(2020, 01, 01);
        Billing b8 = new Billing(3000,"",p8,"none",d8);
        bilingctrl.addBiling(b8);
        i = 9;
        Payment_method p9 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d9 = new Date(2022, 10, 28);
        Billing b9 = new Billing(7000,"",p9,"none",d9);
        bilingctrl.addBiling(b9);
        i = 10;
        Payment_method p10 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d10 = new Date(2002, 12, 28);
        Billing b10 = new Billing(100000,"",p10,"none",d10);
        bilingctrl.addBiling(b10);
    };
}

