package src.seeding;

import src.controller.*;
import src.model.*;

public class User_requestSeeding {

    public static void seed() {
        User_requestController user_requestctrl = new User_requestController();
        CustomerController custctrl = new CustomerController();
        Integer i;

        i = 1;
        Customer c1 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur1 = new User_request(c1, "mouse isnt working");
        user_requestctrl.addUser_request(ur1);
        i = 2;
        Customer c2 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur2 = new User_request(c2, "freeze screen");
        user_requestctrl.addUser_request(ur2);
        i = 3;
        Customer c3 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur3 = new User_request(c3, "sound is bad");
        user_requestctrl.addUser_request(ur3);
        i = 4;
        Customer c4 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur4 = new User_request(c4, "spicy ramen is cold");
        user_requestctrl.addUser_request(ur4);
        i = 5;
        Customer c5 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur5 = new User_request(c5, "connection is too low");
        user_requestctrl.addUser_request(ur5);
        i = 6;
        Customer c6 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur6 = new User_request(c6, "other client noisy");
        user_requestctrl.addUser_request(ur6);
        i = 7;
        Customer c7 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur7 = new User_request(c7, "broken charger");
        user_requestctrl.addUser_request(ur7);
        i = 8;
        Customer c8 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur8 = new User_request(c8, "no headset");
        user_requestctrl.addUser_request(ur8);
        i = 9;
        Customer c9 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur9 = new User_request(c9, "mouse isnt working");
        user_requestctrl.addUser_request(ur9);
        i = 10;
        Customer c10 = custctrl.getValueByIndex(Long.valueOf(i.longValue()));
        User_request ur10 = new User_request(c10, "keyboard isnt working");
        user_requestctrl.addUser_request(ur10);
    };
}
