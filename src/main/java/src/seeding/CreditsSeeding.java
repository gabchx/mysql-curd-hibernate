package src.seeding;

import src.controller.CreditsController;
import src.model.Credits;

public class CreditsSeeding {

    public static void seed() {
        CreditsController creditsctrl = new CreditsController();
        Credits c1 = new Credits(1000, 1);
        creditsctrl.addCredits(c1);

        Credits c2 = new Credits(2000, 2);
        creditsctrl.addCredits(c2);

        Credits c3 = new Credits(3000, 3);
        creditsctrl.addCredits(c3);

        Credits c4 = new Credits(4000, 5);
        creditsctrl.addCredits(c4);

        Credits c5 = new Credits(5000, 7);
        creditsctrl.addCredits(c5);

        Credits c6 = new Credits(7000, 10);
        creditsctrl.addCredits(c6);

        Credits c7 = new Credits(10000, 15);
        creditsctrl.addCredits(c7);

        Credits c8 = new Credits(15000, 25);
        creditsctrl.addCredits(c8);

        Credits c9 = new Credits(35000, 50);
        creditsctrl.addCredits(c9);

        Credits c10 = new Credits(60000, 99);
        creditsctrl.addCredits(c10);

    };
}
