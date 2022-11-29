package src.seeding;

import src.controller.Connection_methodController;
import src.model.Connection_method;

public class Connection_methodSeeding {

    public static void seed() {
        Connection_methodController connection_methodsctrl = new Connection_methodController();
        Connection_method c1 = new Connection_method("Username/Password");
        connection_methodsctrl.addConnection_method(c1);
        Connection_method c2 = new Connection_method("Qr Code");
        connection_methodsctrl.addConnection_method(c2);
        Connection_method c3 = new Connection_method("Application");
        connection_methodsctrl.addConnection_method(c3);

    };
}
