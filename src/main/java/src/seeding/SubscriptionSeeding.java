package src.seeding;

import src.controller.SubscriptionController;
import src.model.Subscription;

public class SubscriptionSeeding {

    public static void seed() {
        SubscriptionController subscriptionctrl = new SubscriptionController();
        Subscription s1 = new Subscription(10, 10000);
        subscriptionctrl.addSubscription(s1);
        Subscription s2 = new Subscription(20, 15000);
        subscriptionctrl.addSubscription(s2);
        Subscription s3 = new Subscription(30, 20000);
        subscriptionctrl.addSubscription(s3);
        Subscription s4 = new Subscription(40, 25000);
        subscriptionctrl.addSubscription(s4);
        Subscription s5 = new Subscription(50, 30000);
        subscriptionctrl.addSubscription(s5);
        Subscription s6 = new Subscription(60, 40000);
        subscriptionctrl.addSubscription(s6);
        Subscription s7 = new Subscription(70, 45000);
        subscriptionctrl.addSubscription(s7);
        Subscription s8 = new Subscription(80, 50000);
        subscriptionctrl.addSubscription(s8);
        Subscription s9 = new Subscription(90, 55000);
        subscriptionctrl.addSubscription(s9);
        Subscription s10 = new Subscription(100, 60000);
        subscriptionctrl.addSubscription(s10);
    };
}
