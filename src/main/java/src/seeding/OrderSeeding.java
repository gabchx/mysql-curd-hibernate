package src.seeding;

import src.controller.*;
import src.model.*;
import src.model.Order;

public class OrderSeeding {

    public static void seed() {
        OrderController orderctrl = new OrderController();
        CustomerController custctrl = new CustomerController();
        BillingController bilingctrl = new BillingController();
        ProductController productctrl = new ProductController();
        Integer i;
        i=1;
        Customer c1 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p1 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b1 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));


        Order o1 = new Order(c1,p1,b1);
        orderctrl.addOrder(o1);
    };
}
