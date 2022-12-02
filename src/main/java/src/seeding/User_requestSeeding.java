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
    };
}
