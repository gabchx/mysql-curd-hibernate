package src.seeding;

import src.controller.*;
import src.model.*;

public class SupplierSeeding {

    public static void seed() {
        SupplierController supplierctrl = new SupplierController();
        Supplier sp1 = new Supplier("Lotte", "+82154658734", 8);
        supplierctrl.addSupplier(sp1);
        Supplier sp2 = new Supplier("Emart", "+82154658735", 8);
        supplierctrl.addSupplier(sp2);
        Supplier sp3 = new Supplier("GS25", "+82154658736", 8);
        supplierctrl.addSupplier(sp3);
        Supplier sp4 = new Supplier("CU", "+82154658737", 8);
        supplierctrl.addSupplier(sp4);
        Supplier sp5 = new Supplier("7Eleven", "+82154658739", 8);
        supplierctrl.addSupplier(sp5);
        Supplier sp6= new Supplier("Lotte Deli", "+82154658738", 8);
        supplierctrl.addSupplier(sp6);
        Supplier sp7 = new Supplier("Lotte Fresh", "+82154658787", 8);
        supplierctrl.addSupplier(sp7);
        Supplier sp8= new Supplier("Chefood", "+82154658786", 8);
        supplierctrl.addSupplier(sp8);
        Supplier sp9 = new Supplier("Emart24", "+82154658785", 8);
        supplierctrl.addSupplier(sp9);
        Supplier sp10 = new Supplier("Starbucks", "+82154658784", 8);
        supplierctrl.addSupplier(sp10);
    };
}