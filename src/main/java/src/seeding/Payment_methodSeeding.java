package src.seeding;

import src.controller.Payment_methodController;
import src.model.Payment_method;

public class Payment_methodSeeding {

    public static void seed() {
        Payment_methodController payment_methodsctrl = new Payment_methodController();
        Payment_method p1 = new Payment_method("Kakao Pay", 3);
        payment_methodsctrl.addPayment_method(p1);
        Payment_method p2 = new Payment_method("Payco", 3);
        payment_methodsctrl.addPayment_method(p2);
        Payment_method p3 = new Payment_method("Tmoney card", 3);
        payment_methodsctrl.addPayment_method(p3);
        Payment_method p4 = new Payment_method("Visa", 3);
        payment_methodsctrl.addPayment_method(p4);
        Payment_method p5 = new Payment_method("Cash", 3);
        payment_methodsctrl.addPayment_method(p5);
        Payment_method p6 = new Payment_method("Samsung Pay", 3);
        payment_methodsctrl.addPayment_method(p6);
        Payment_method p7 = new Payment_method("Apple Pay", 3);
        payment_methodsctrl.addPayment_method(p7);
        Payment_method p8 = new Payment_method("Master Card", 3);
        payment_methodsctrl.addPayment_method(p8);
        Payment_method p9 = new Payment_method("American Express", 3);
        payment_methodsctrl.addPayment_method(p9);
        Payment_method p10 = new Payment_method("Bank Transfer", 3);
        payment_methodsctrl.addPayment_method(p10);
    };
}
