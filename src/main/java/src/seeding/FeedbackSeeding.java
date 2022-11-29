package src.seeding;

import src.controller.FeedbackController;
import src.model.Feedback;

public class FeedbackSeeding {

    public static void seed() {
        FeedbackController feedbackctrl = new FeedbackController();
        Feedback f1 = new Feedback("Good", "Love this place");
        feedbackctrl.addFeedback(f1);
    };
}
