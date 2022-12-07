package src.seeding;
import src.controller.AuthenticationController;
import src.controller.CustomerController;
import src.model.Authentication;
import src.model.Customer;
import java.util.Date;

public class CustomerSeeding {

    public static void seed() {
        CustomerController custctrl = new CustomerController();
        AuthenticationController authctrl = new AuthenticationController();

        Authentication a1 = new Authentication("Tahne","solylavermine");
        authctrl.addAuthentication(a1);
        Date d1 = new Date(2003, 2, 01);
        Customer c1 = new Customer("Noufette","protandtesto@email.com",a1,d1,5);
        custctrl.addCustomer(c1);

        Authentication a2 = new Authentication("mariepipi","baltoutou");
        authctrl.addAuthentication(a2);
        Date d2 = new Date(2002, 8, 14);
        Customer c2 = new Customer("Later","5mintkt@email.com",a2,d2,34);
        custctrl.addCustomer(c2);

        Authentication a3 = new Authentication("enorme_soloche","singeries2");
        authctrl.addAuthentication(a3);
        Date d3 = new Date(2002, 12, 28);
        Customer c3 = new Customer("Soly","tasoloche@email.com",a3,d3,99);
        custctrl.addCustomer(c3);

        Authentication a4 = new Authentication("chris","misscata1");
        authctrl.addAuthentication(a4);
        Date d4 = new Date(2002, 8, 12);
        Customer c4 = new Customer("Chrispouille","chris02@email.com",a4,d4,45);
        custctrl.addCustomer(c4);

        Authentication a5 = new Authentication("sachaah","sousou69");
        authctrl.addAuthentication(a5);
        Customer c5 = new Customer("Elias","pikapika88@email.com",a5,d1,1);
        custctrl.addCustomer(c5);

        Authentication a6 = new Authentication("BIG_ETIENNE","cauburgerpop");
        authctrl.addAuthentication(a6);
        Date d5 = new Date(2003, 12, 15);
        Customer c6 = new Customer("Tienne","t-rex@email.com",a6,d5,8);
        custctrl.addCustomer(c6);

        Authentication a7 = new Authentication("nenesse","mangermangermanger");
        authctrl.addAuthentication(a7);
        Date d6 = new Date(2002, 10, 19);
        Customer c7 = new Customer("Inestle","gauffres99@email.com",a7,d6,52);
        custctrl.addCustomer(c7);

        Authentication a8 = new Authentication("louloupe","terra4life");
        authctrl.addAuthentication(a8);
        Date d7 = new Date(2006, 02, 01);
        Customer c8 = new Customer("Lousse","someg.fan@email.com",a8,d7,2);
        custctrl.addCustomer(c8);

        Authentication a9 = new Authentication("Gobe_Riel","azerti?");
        authctrl.addAuthentication(a9);
        Date d8 = new Date(2002, 8, 26);
        Customer c9 = new Customer("Gaback","quiestriel@email.com",a9,d8,66);
        custctrl.addCustomer(c9);

        Authentication a10 = new Authentication("Carhhhapuce","edgarmylove");
        authctrl.addAuthentication(a10);
        Customer c10 = new Customer("Ricky","jeveuxetrepapa@email.com",a10,d8,12);
        custctrl.addCustomer(c10);


    };
}

