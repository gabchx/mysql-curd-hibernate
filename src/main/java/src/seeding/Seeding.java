package src.seeding;

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
        System.out.println("Seeding complete!");
    };
}
