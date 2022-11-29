package src.seeding;

import src.controller.CreditsController;
import src.model.Credits;

public class CreditsSeeding {

    public static void seed() {
        CreditsController creditsctrl = new CreditsController();
        Credits c1 = new Credits(1000, 1);
        creditsctrl.addCredits(c1);
    };
}
