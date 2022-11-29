package src.seeding;

import src.controller.Payment_methodController;
import src.model.Payment_method;

public class Payment_methodSeeding {

    public static void seed() {
        Payment_methodController payment_methodsctrl = new Payment_methodController();
        Payment_method p1 = new Payment_method("Kakao Pay", 3);
        payment_methodsctrl.addPayment_method(p1);
    };
}
