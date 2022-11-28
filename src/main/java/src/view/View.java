package src.view;

import lombok.SneakyThrows;
import org.hibernate.Session;
import src.controller.*;
import src.model.*;
import src.seeding.Seeding;
import src.util.HibernateSession;

import java.util.*;

public class View {


    private static final Scanner scanner = new Scanner(System.in);
    private final Map<String, Printable> menu = new LinkedHashMap<>();

    private final CustomerController customerController = new CustomerController();
    private final AuthenticationController authenticationController = new AuthenticationController();


    public View() {
        menu.put("MS", this::ms);
        menu.put("M", this::m);
        menu.put("S", this::s);
        menu.put("11", this::getAllCustomers);
        menu.put("12", this::getCustomerById);
        menu.put("13", this::addCustomer);
        menu.put("14", this::updateCustomer);
        menu.put("15", this::deleteCustomer);
        menu.put("quite", this::show);

    }

    public final void show() {
        String input;
        Menu showMenu = new Menu();
        showMenu.displayMenu();
        System.out.println("\nEnter combination:\n");
        do {
            try {
                input = scanner.next();
                menu.get(input).print();
            } catch (Exception ignored){
            }
        } while (scanner.hasNext());
    }

    public void ending(){
        String r;
        System.out.println("Show the menu again enter 'M'");
        System.out.println("To Quit 'Q'");
        r = scanner.next();
        if(Objects.equals(r, "M")){
            show();
        }
        else if(Objects.equals(r, "Q")){
            System.exit(0);
        }

    }
    //========================== Special =================================

    //querry
    public void ms(){
        Session session = HibernateSession.getSessionFactory().openSession();
        Seeding.seedAllTable();
        ending();
    }
    public void m(){
        Session session = HibernateSession.getSessionFactory().openSession();
        ending();
    }
    public void s(){
        Seeding.seedAllTable();
        ending();
    }


    //========================== CUSTOMERS =================================

    public void getAllCustomers() {
        System.out.println("List of all customers:");
        customerController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteCustomer() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        customerController.deleteCustomer(index);
        ending();
    }

    public void getCustomerById() {
        System.out.println("Enter id in order to get Customer:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (customerController.getValueByIndex(id) != null)
                System.out.println(customerController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
            getCustomerById();
        }
        ending();
    }

    public void addCustomer() {
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Enter user_name:");
        String user_name = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        System.out.println("Enter birthdate (ddmmyyyy):");
        Integer birthdate = Integer.parseInt(scanner.next());
        System.out.println("Enter time_left:");
        Integer time_left = Integer.parseInt(scanner.next());
        Authentication newauth = new Authentication(user_name,password);
        authenticationController.addAuthentication(newauth);
        Customer newCustomer = new Customer(name,email,newauth,birthdate,time_left);
        customerController.addCustomer(newCustomer);
        ending();
    }

    public void updateCustomer() {
        System.out.println("Enter id in order to find element:");
        Long id = Long.parseLong(scanner.next());
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        System.out.println("Enter birthdate (ddmmyyyy):");
        Integer birthdate = Integer.parseInt(scanner.next());
        System.out.println("Enter time_left:");
        Integer time_left = Integer.parseInt(scanner.next());

        String user_name = customerController.getValueByIndex(id).getAuthentication().getUser_name();

        Authentication newAuthentication = new Authentication(user_name,password);
        authenticationController.updateAuthentication(user_name, newAuthentication);
        Customer newCustomer = new Customer(id,name,email,newAuthentication,birthdate,time_left);
        customerController.updateCustomer(id, newCustomer);
        ending();
    }
}