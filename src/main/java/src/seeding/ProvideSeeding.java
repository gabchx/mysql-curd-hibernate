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
    };
}
