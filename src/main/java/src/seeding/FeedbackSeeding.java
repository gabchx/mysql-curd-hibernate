package src.seeding;

import src.controller.FeedbackController;
import src.model.Feedback;
import java.util.Random;

public class FeedbackSeeding {

    public static void seed() {
        FeedbackController feedbackctrl = new FeedbackController();

        Feedback f1 = new Feedback("4", "Love this place","game");
        feedbackctrl.addFeedback(f1);

        Feedback f2 = new Feedback("3", "ramen were cold","food_service");
        feedbackctrl.addFeedback(f2);
        Feedback f3 = new Feedback("5", "The staff is so nice","food_service");
        feedbackctrl.addFeedback(f3);
        Feedback f4 = new Feedback("2", "Lots of noise while playling ","game");
        feedbackctrl.addFeedback(f4);
        Feedback f5 = new Feedback("3", "Nice place","food_service");
        feedbackctrl.addFeedback(f5);
        Feedback f6 = new Feedback("5", "Love the cats ears on the headset","game");
        feedbackctrl.addFeedback(f6);
        Feedback f7 = new Feedback("5", "Best cookies of my life","food_service");
        feedbackctrl.addFeedback(f7);
        Feedback f8 = new Feedback("4", "Connection is good","fix");
        feedbackctrl.addFeedback(f8);
        Feedback f9 = new Feedback("0", "Lost my game bcs of the lagging","game");
        feedbackctrl.addFeedback(f9);
        Feedback f10 = new Feedback("5", "this place is sooooooo cool","food");
        feedbackctrl.addFeedback(f10);

        String[] note = {"1","2","3","4","5","0"};
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            feedbackctrl.addFeedback(new Feedback(note[r.nextInt(6)],"bcl for ;)","food_service"));
        }

    };
}