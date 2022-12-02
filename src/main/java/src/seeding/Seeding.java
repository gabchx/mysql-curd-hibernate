package src.seeding;

import src.model.Components_list;
import src.model.Subscribe;
import src.model.Warning_message;

public class Seeding {
    public static void seedAllTable() {
        CustomerSeeding.seed();
        PlaceSeeding.seed();
        TimeslotSeeding.seed();
        EmployeeSeeding.seed();
        //Employee_historySeeding.seed();
        Connection_methodSeeding.seed();
        Payment_methodSeeding.seed();
        SubscriptionSeeding.seed();
        FeedbackSeeding.seed();
        CreditsSeeding.seed();
        TopupSeeding.seed();
        ComponentSeeding.seed();
        Components_listSeeding.seed();
        ComputersSeeding.seed();
        ConnectionSeeding.seed();
        FixSeeding.seed();
        GameSeeding.seed();
        SubscribeSeeding.seed();
        User_requestSeeding.seed();
        Warning_messageSeeding.seed();
        System.out.println("Seeding complete!");
    };
}
