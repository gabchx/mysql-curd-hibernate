package src.seeding;

import src.controller.Warning_messageController;
import src.model.Warning_message;

public class Warning_messageSeeding {

    public static void seed() {
        Warning_messageController warning_messagectrl = new Warning_messageController();
        Warning_message c1 = new Warning_message("if you are less than 19y old please leave before 10pm",true);
        warning_messagectrl.addWarning_message(c1);
        Warning_message c2 = new Warning_message("if you are less than 19y old please don t order alcohol",true);
        warning_messagectrl.addWarning_message(c2);
        Warning_message c3 = new Warning_message("if you are less than 19y old you can't play this game",true);
        warning_messagectrl.addWarning_message(c3);
        Warning_message c4 = new Warning_message("this game is not allowed in Korea sorry",true);
        warning_messagectrl.addWarning_message(c4);
        Warning_message c5 = new Warning_message("server down ",true);
        warning_messagectrl.addWarning_message(c5);
        Warning_message c6 = new Warning_message("We are sorry the connection is low right now",true);
        warning_messagectrl.addWarning_message(c6);
        Warning_message c7 = new Warning_message("You have been playing for the last 2h, take a break ? ",true);
        warning_messagectrl.addWarning_message(c7);
        Warning_message c8 = new Warning_message("Use a polite vocabulary talking to other gamers",true);
        warning_messagectrl.addWarning_message(c8);
        Warning_message c9 = new Warning_message("You have been playing for the last 4h, you should have a break  ",true);
        warning_messagectrl.addWarning_message(c9);
        Warning_message c10 = new Warning_message("You have been playing for the last 6h, take a break right now ! ",true);
        warning_messagectrl.addWarning_message(c10);
    };
}
