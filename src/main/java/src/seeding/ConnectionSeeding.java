package src.seeding;

import src.controller.*;
import src.model.*;

public class ConnectionSeeding {

    public static void seed() {
        ConnectionController connectionctrl = new ConnectionController();
        ComputersController computersctrl = new ComputersController();
        CustomerController cstctrl = new CustomerController();
        Connection_methodController cmctrl = new Connection_methodController();
        FeedbackController fctrl = new FeedbackController();

        Integer i;

        i = 1;
        Customer cst1 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt1 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Connection_method cm1 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f1 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx1 = new Connection(cst1,cpt1, cm1, 123, f1);
        connectionctrl.addConnection(cnx1);
        i = 2;
        Customer cst2 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt2 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Connection_method cm2 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f2 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx2 = new Connection(cst2,cpt2, cm2, 1250, f2);
        connectionctrl.addConnection(cnx2);
        i = 3;
        Customer cst3 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt3 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Connection_method cm3 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f3 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx3 = new Connection(cst3,cpt3, cm3, 52, f3);
        connectionctrl.addConnection(cnx1);
        i = 4;
        Customer cst4 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt4 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=2;
        Connection_method cm4 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f4 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx4 = new Connection(cst4,cpt4, cm4, 702, f4);
        connectionctrl.addConnection(cnx1);
        i = 5;
        Customer cst5 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt5 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=3;
        Connection_method cm5 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f5 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx5 = new Connection(cst5,cpt5, cm5, 65, f5);
        connectionctrl.addConnection(cnx5);
        i = 6;
        Customer cst6 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt6 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=2;
        Connection_method cm6 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f6 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx6 = new Connection(cst6,cpt6, cm6, 69, f6);
        connectionctrl.addConnection(cnx1);
        i = 7;
        Customer cst7 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt7 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=1;
        Connection_method cm7 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f7 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx7= new Connection(cst7,cpt7, cm7, 74, f7);
        connectionctrl.addConnection(cnx7);
        i = 8;
        Customer cst8 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt8 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=2;
        Connection_method cm8 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f8 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx8 = new Connection(cst8,cpt8, cm8, 121, f8);
        connectionctrl.addConnection(cnx8);
        i = 9;
        Customer cst9 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt9 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=3;
        Connection_method cm9 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f9 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx9 = new Connection(cst9,cpt9, cm9,235, f9);
        connectionctrl.addConnection(cnx9);
        i = 10;
        Customer cst10 = cstctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Computers cpt10 = computersctrl.getValueByIndex(Long.valueOf(i.longValue()));
        i=2;
        Connection_method cm10 = cmctrl.getValueByIndex(Long.valueOf(i.longValue()));
        Feedback f10 = fctrl.getValueByIndex(Long.valueOf(i.longValue()));

        Connection cnx10 = new Connection(cst10,cpt10, cm10, 120, f10);
        connectionctrl.addConnection(cnx10);
    };
}
