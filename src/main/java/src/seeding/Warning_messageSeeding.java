package src.seeding;

import src.controller.Warning_messageController;
import src.model.Warning_message;

public class Warning_messageSeeding {

    public static void seed() {
        Warning_messageController warning_messagectrl = new Warning_messageController();
        Warning_message c1 = new Warning_message("if you are less than 18y old please leave before 10pm",true);
        warning_messagectrl.addWarning_message(c1);
    };
}
