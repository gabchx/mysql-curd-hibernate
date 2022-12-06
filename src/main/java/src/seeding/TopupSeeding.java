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
        Payment_method p1 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d1 = new Date(2002,02,21);
        Topup t1 = new Topup(c1,cd1,d1,p1,"none");
        topupctrl.addTopup(t1);


        i=2;
        Customer c2 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd2 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p2 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d2 = new Date(1964,04,21);
        Topup t2 = new Topup(c2,cd2,d2,p2,"cash");
        topupctrl.addTopup(t2);

        i=3;
        Customer c3 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd3 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p3 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d3 = new Date(1998,01,16);
        Topup t3 = new Topup(c3,cd3,d3,p3,"bluecard");
        topupctrl.addTopup(t3);

        i=4;
        Customer c4 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd4 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p4 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d4 = new Date(1986,03,10);
        Topup t4 = new Topup(c4,cd4,d4,p4,"direct debit");
        topupctrl.addTopup(t4);

        i=5;
        Customer c5 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd5 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p5 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d5 = new Date(2001,06,12);
        Topup t5 = new Topup(c5,cd5,d5,p5,"cash");
        topupctrl.addTopup(t5);

        i=6;
        Customer c6 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd6 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p6 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d6 = new Date(2004,03,23);
        Topup t6 = new Topup(c6,cd6,d6,p6,"none");
        topupctrl.addTopup(t6);

        i=7;
        Customer c7 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd7 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p7 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d7 = new Date(2000,07,15);
        Topup t7 = new Topup(c7,cd7,d7,p7,"direct debit");
        topupctrl.addTopup(t7);

        i=8;
        Customer c8 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd8 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p8 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d8 = new Date(1997,05,18);
        Topup t8 = new Topup(c8,cd8,d8,p8,"credit card");
        topupctrl.addTopup(t8);

        i=9;
        Customer c9 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd9 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p9 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d9 = new Date(2003,11,28);
        Topup t9 = new Topup(c9,cd9,d9,p9,"cash");
        topupctrl.addTopup(t9);

        i=10;
        Customer c10 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Credits cd10 = credctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Payment_method p10 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d10 = new Date(1995,03,05);
        Topup t10 = new Topup(c10,cd10,d10,p10,"direct debit");
        topupctrl.addTopup(t10);


    };
}

