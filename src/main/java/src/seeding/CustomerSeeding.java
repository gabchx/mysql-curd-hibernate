package src.seeding;
import src.controller.AuthenticationController;
import src.controller.CustomerController;
import src.model.Authentication;
import src.model.Customer;

public class CustomerSeeding {

    public static void seed() {
        CustomerController custctrl = new CustomerController();
        AuthenticationController authctrl = new AuthenticationController();

        Authentication a1 = new Authentication("Tahne","solylavermine");
        authctrl.addAuthentication(a1);
        Customer c1 = new Customer("Noufette","protandtesto@email.com",a1,01022003,5);
        custctrl.addCustomer(c1);

        Authentication a2 = new Authentication("mariepipi","baltoutou");
        authctrl.addAuthentication(a2);
        Customer c2 = new Customer("Later","5mintkt@email.com",a2,14082002,34);
        custctrl.addCustomer(c2);

        Authentication a3 = new Authentication("enorme_soloche","singeries2");
        authctrl.addAuthentication(a3);
        Customer c3 = new Customer("Soly","tasoloche@email.com",a3,28122002,99);
        custctrl.addCustomer(c3);

        Authentication a4 = new Authentication("chris","misscata1");
        authctrl.addAuthentication(a4);
        Customer c4 = new Customer("Chrispouille","chris02@email.com",a4,12082002,45);
        custctrl.addCustomer(c4);

        Authentication a5 = new Authentication("sachaah","sousou69");
        authctrl.addAuthentication(a5);
        Customer c5 = new Customer("Elias","pikapika88@email.com",a5,01022002,1);
        custctrl.addCustomer(c5);

        Authentication a6 = new Authentication("BIG_ETIENNE","cauburgerpop");
        authctrl.addAuthentication(a6);
        Customer c6 = new Customer("Tienne","t-rex@email.com",a6,15122003,8);
        custctrl.addCustomer(c6);

        Authentication a7 = new Authentication("nenesse","mangermangermanger");
        authctrl.addAuthentication(a7);
        Customer c7 = new Customer("Inestle","gauffres99@email.com",a7,19102002,52);
        custctrl.addCustomer(c7);

        Authentication a8 = new Authentication("louloupe","terra4life");
        authctrl.addAuthentication(a8);
        Customer c8 = new Customer("Lousse","someg.fan@email.com",a8,01022006,2);
        custctrl.addCustomer(c8);

        Authentication a9 = new Authentication("Gobe_Riel","azerti?");
        authctrl.addAuthentication(a9);
        Customer c9 = new Customer("Gaback","quiestriel@email.com",a9,26082002,66);
        custctrl.addCustomer(c9);

        Authentication a10 = new Authentication("Carhhhapuce","edgarmylove");
        authctrl.addAuthentication(a10);
        Customer c10 = new Customer("Ricky","jeveuxetrepapa@email.com",a10,26082002,12);
        custctrl.addCustomer(c10);


    };
}

