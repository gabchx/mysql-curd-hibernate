package src.seeding;

import src.controller.*;
import src.model.*;

public class SupplierSeeding {

    public static void seed() {
        SupplierController supplierctrl = new SupplierController();
        Supplier sp1 = new Supplier("Lotte", "+82154658734", 8);
        supplierctrl.addSupplier(sp1);
    };
}