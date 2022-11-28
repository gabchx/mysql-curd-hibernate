package src.seeding;
import src.controller.AuthenticationController;
import src.controller.CustomerController;
import src.model.Authentication;
import src.model.Customer;

public class CustomerSeeding {

    public static void seed() {
        CustomerController custctrl = new CustomerController();
        AuthenticationController authctrl = new AuthenticationController();

        Authentication a1 = new Authentication("tom","1234");
        authctrl.addAuthentication(a1);
        Customer c1 = new Customer("Thomas","thomas@email.com",a1,01022003,5);
        custctrl.addCustomer(c1);

        Authentication a2 = new Authentication("mar1e","1234");
        authctrl.addAuthentication(a2);
        Customer c2 = new Customer("Marie","marie@email.com",a2,01022003,5);
        custctrl.addCustomer(c2);
    };
}
