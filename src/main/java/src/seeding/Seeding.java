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
        ComponentSeeding.seed();
        Components_listSeeding.seed();
        ComputersSeeding.seed();
        ConnectionSeeding.seed();
        FixSeeding.seed();
        GameSeeding.seed();
        SubscribeSeeding.seed();
        User_requestSeeding.seed();
        Warning_messageSeeding.seed();

        RecipeSeeding.seed();
        ProductSeeding.seed();
        SupplierSeeding.seed();
        BillingSeeding.seed();
        ServeSeeding.seed();
        ProvideSeeding.seed();
        //OrderSeeding.seed();

        System.out.println("Seeding complete!");
    };
}
