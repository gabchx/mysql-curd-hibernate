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

        i=2;
        Customer c2 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p2 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b2 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o2 = new Order(c2,p2,b2);
        orderctrl.addOrder(o2);

        i=3;
        Customer c3 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p3 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b3 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o3 = new Order(c3,p3,b3);
        orderctrl.addOrder(o3);

        i=4;
        Customer c4 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p4 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b4= bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o4= new Order(c4,p4,b4);
        orderctrl.addOrder(o4);

        i=5;
        Customer c5 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p5 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b5 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o5 = new Order(c5,p5,b5);
        orderctrl.addOrder(o5);

        i=6;
        Customer c6 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p6 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b6 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o6 = new Order(c6,p6,b6);
        orderctrl.addOrder(o6);

        i=7;
        Customer c7 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p7 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b7 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o7 = new Order(c7,p7,b7);
        orderctrl.addOrder(o7);

        i=8;
        Customer c8 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p8 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b8 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o8 = new Order(c8,p8,b8);
        orderctrl.addOrder(o8);

        i=9;
        Customer c9 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p9 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b9 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o9 = new Order(c9,p9,b9);
        orderctrl.addOrder(o9);

        i=10;
        Customer c10 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Product p10 = productctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Billing b10 = bilingctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Order o10 = new Order(c10,p10,b10);
        orderctrl.addOrder(o10);



    };
}
