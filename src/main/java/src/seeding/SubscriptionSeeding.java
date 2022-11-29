package src.seeding;

import src.controller.SubscriptionController;
import src.model.Subscription;

public class SubscriptionSeeding {

    public static void seed() {
        SubscriptionController subscriptionctrl = new SubscriptionController();
        Subscription s1 = new Subscription(10, 10000);
        subscriptionctrl.addSubscription(s1);
    };
}
