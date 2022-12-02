package src.seeding;

import src.controller.CustomerController;
import src.controller.Payment_methodController;
import src.controller.SubscribeController;
import src.controller.SubscriptionController;
import src.model.Subscription;
import src.model.Customer;
import src.model.Payment_method;
import src.model.Subscribe;
import java.util.Date;

public class SubscribeSeeding {

    public static void seed() {
        SubscribeController subscribectrl = new SubscribeController();
        CustomerController custctrl = new CustomerController();
        SubscriptionController subctrl = new SubscriptionController();
        Payment_methodController payctrl = new Payment_methodController();
        Integer i;

        i = 1;
        Customer c1 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Subscription s1 = subctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i = 1;
        Payment_method p1 = payctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Date d1 = new Date(2002, 02, 21);
        Subscribe t1 = new Subscribe(c1, s1, d1, p1, "none");
        subscribectrl.addSubscribe(t1);
    };
}
