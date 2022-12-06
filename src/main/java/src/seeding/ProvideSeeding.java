package src.seeding;

import src.controller.*;
import src.model.*;
import java.util.Date;

public class ProvideSeeding {

    public static void seed() {
        ProvideController providectrl = new ProvideController();
        SupplierController splctrl = new SupplierController();
        ProductController productctrl = new ProductController();

        Integer i;

        i = 1;
        Supplier s1 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr1 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d1 = new Date(2002, 02, 21);
        Provide p1 = new Provide(s1, pr1, d1);
        providectrl.addProvide(p1);

        i = 2;
        Supplier s2 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr2 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d2 = new Date(2022, 03, 06);
        Provide p2 = new Provide(s2, pr2, d2);
        providectrl.addProvide(p2);

        i = 3;
        Supplier s3 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr3 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d3 = new Date(2021, 04, 28);
        Provide p3 = new Provide(s3, pr3, d3);
        providectrl.addProvide(p3);

        i = 4;
        Supplier s4 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr4 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d4 = new Date(2022, 06, 13);
        Provide p4 = new Provide(s4, pr4, d4);
        providectrl.addProvide(p4);

        i = 5;
        Supplier s5 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr5 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d5 = new Date(2016, 07, 20);
        Provide p5 = new Provide(s5, pr5, d5);
        providectrl.addProvide(p5);

        i = 6;
        Supplier s6 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr6 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d6 = new Date(2021, 07, 02);
        Provide p6 = new Provide(s6, pr6, d6);
        providectrl.addProvide(p6);

        i = 7;
        Supplier s7 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr7 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d7 = new Date(2013, 12, 21);
        Provide p7 = new Provide(s7, pr7, d7);
        providectrl.addProvide(p7);

        i = 8;
        Supplier s8 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr8 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d8 = new Date(2018, 11, 18);
        Provide p8 = new Provide(s8, pr8, d8);
        providectrl.addProvide(p8);

        i = 9;
        Supplier s9 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr9 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d9 = new Date(2002, 10, 29);
        Provide p9 = new Provide(s9, pr9, d9);
        providectrl.addProvide(p9);

        i = 10;
        Supplier s10 = splctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product pr10 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d10 = new Date(2002, 12, 03);
        Provide p10 = new Provide(s10, pr10, d10);
        providectrl.addProvide(p10);
    };
}
