package src.seeding;

import src.controller.FeedbackController;
import src.model.Feedback;

public class FeedbackSeeding {

    public static void seed() {
        FeedbackController feedbackctrl = new FeedbackController();

        Feedback f1 = new Feedback("Good", "Love this place");
        feedbackctrl.addFeedback(f1);

        Feedback f2 = new Feedback("Cold", "ramen were cold");
        feedbackctrl.addFeedback(f2);
        Feedback f3 = new Feedback("perfect", "The staff is so nice");
        feedbackctrl.addFeedback(f3);
        Feedback f4 = new Feedback("Noisy customer", "Lots of noise while playling ");
        feedbackctrl.addFeedback(f4);
        Feedback f5 = new Feedback("ok", "Nice place");
        feedbackctrl.addFeedback(f5);
        Feedback f6 = new Feedback("Lovely", "Love the cats ears on the headset");
        feedbackctrl.addFeedback(f6);
        Feedback f7 = new Feedback("yummy", "Best cookies of my life");
        feedbackctrl.addFeedback(f7);
        Feedback f8 = new Feedback("yes", "Connection is good");
        feedbackctrl.addFeedback(f8);
        Feedback f9 = new Feedback("lagged", "Lost my game bcs of the lagging");
        feedbackctrl.addFeedback(f9);
        Feedback f10 = new Feedback("nice", "this place is sooooooo cool");
        feedbackctrl.addFeedback(f10);
    };
}
