package src.view;

import lombok.SneakyThrows;
import org.hibernate.Session;
import src.controller.*;
import src.model.*;
import src.seeding.EmployeeSeeding;
import src.seeding.Seeding;
import src.seeding.User_requestSeeding;
import src.util.HibernateSession;

import java.util.*;

public class View {


    private static final Scanner scanner = new Scanner(System.in);
    private final Map<String, Printable> menu = new LinkedHashMap<>();

    private final CustomerController customerController = new CustomerController();
    private final AuthenticationController authenticationController = new AuthenticationController();
    private final Connection_methodController connection_methodController = new Connection_methodController();
    private final CreditsController creditsController = new CreditsController();
    private final EmployeeController employeeController = new EmployeeController();
    private final Employee_historyController employee_historyController = new Employee_historyController();
    private final FeedbackController feedbackController = new FeedbackController();
    private final PlaceController placeController = new PlaceController();
    private final SubscriptionController subscriptionController = new SubscriptionController();
    private final TimeslotController timeslotController = new TimeslotController();
    private final TopupController topupController = new TopupController();
    private final Payment_methodController payment_methodController = new Payment_methodController();
    private final SubscribeController subscribeController = new SubscribeController();
    private final ComponentController componentController = new ComponentController();
    private final Components_listController components_listController = new Components_listController();
    private final GameController gameController = new GameController();
    private final FixController fixController = new FixController();
    private final Warning_messageController warning_messageController = new Warning_messageController();
    private final User_requestController user_requestController = new User_requestController();
    private final ComputersController computersController = new ComputersController();
    private final ConnectionController connectionController = new ConnectionController();


    public View() {
        menu.put("MS", this::ms);
        menu.put("M", this::m);
        menu.put("S", this::s);
        menu.put("11", this::getAllCustomers);
        menu.put("12", this::getCustomerById);
        menu.put("13", this::addCustomer);
        menu.put("14", this::updateCustomer);
        menu.put("15", this::deleteCustomer);
        menu.put("21", this::getAllAuthentication);
        menu.put("22", this::getAuthenticationById);
        menu.put("25", this::deleteAuthentication);
        menu.put("31", this::getAllPlace);
        menu.put("32", this::getPlaceById);
        menu.put("35", this::deletePlace);
        menu.put("41", this::getAllTimeslot);
        menu.put("42", this::getTimeslotById);
        menu.put("45", this::deleteTimeslot);
        menu.put("51", this::getAllConnection_method);
        menu.put("52", this::getConnection_methodById);
        menu.put("55", this::deleteConnection_method);
        menu.put("61", this::getAllPayment_method);
        menu.put("62", this::getPayment_methodById);
        menu.put("65", this::deletePayment_method);
        menu.put("71", this::getAllFeedback);
        menu.put("72", this::getFeedbackById);
        menu.put("75", this::deleteFeedback);
        menu.put("81", this::getAllCredits);
        menu.put("82", this::getCreditsById);
        menu.put("85", this::deleteCredits);
        menu.put("91", this::getAllSubscription);
        menu.put("92", this::getSubscriptionById);
        menu.put("95", this::deleteSubscription);
        menu.put("101", this::getAllTopup);
        menu.put("102", this::getTopupById);
        menu.put("105", this::deleteTopup);
        menu.put("111", this::getAllEmployee);
        menu.put("112", this::getEmployeeById);
        menu.put("115", this::deleteEmployee);
        menu.put("121", this::getAll);
        menu.put("122", this::get);
        menu.put("125", this::delete);

        menu.put("131", this::getAllSubscribe);
        menu.put("132", this::getSubscribeById);
        menu.put("135", this::deleteSubscribe);
        menu.put("141", this::getAllComponent);
        menu.put("142", this::getComponentById);
        menu.put("145", this::deleteComponent);
        menu.put("151", this::getAllComponents_list);
        menu.put("152", this::getComponents_listById);
        menu.put("155", this::deleteComponents_list);
        menu.put("161", this::getAllGame);
        menu.put("162", this::getGameById);
        menu.put("165", this::deleteGame);
        menu.put("171", this::getAllFix);
        menu.put("172", this::getFixById);
        menu.put("175", this::deleteFix);
        menu.put("181", this::getAllWarning_message);
        menu.put("182", this::getWarning_messageById);
        menu.put("185", this::deleteWarning_message);
        menu.put("191", this::getAllUser_request);
        menu.put("192", this::getUser_requestById);
        menu.put("195", this::deleteUser_request);
        menu.put("201", this::getAllComputers);
        menu.put("202", this::getComputersById);
        menu.put("205", this::deleteComputers);
        menu.put("211", this::getAllConnection);
        menu.put("212", this::getConnectionById);
        menu.put("215", this::deleteConnection);

        menu.put("221", this::getAll);
        menu.put("222", this::get);
        menu.put("225", this::delete);
        menu.put("231", this::getAll);
        menu.put("232", this::get);
        menu.put("235", this::delete);
        menu.put("241", this::getAll);
        menu.put("242", this::get);
        menu.put("245", this::delete);
        menu.put("251", this::getAll);
        menu.put("252", this::get);
        menu.put("255", this::delete);
        menu.put("261", this::getAll);
        menu.put("262", this::get);
        menu.put("265", this::delete);
        menu.put("271", this::getAll);
        menu.put("272", this::get);
        menu.put("275", this::delete);
        menu.put("281", this::getAll);
        menu.put("282", this::get);
        menu.put("285", this::delete);
        menu.put("291", this::getAll);
        menu.put("292", this::get);
        menu.put("295", this::delete);
        menu.put("301", this::getAll);
        menu.put("302", this::get);
        menu.put("305", this::delete);

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
        System.out.println("\nShow the menu again enter 'M'");
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

    public void getAll(){};public void get(){}; public void delete(){};


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
    //========================== AUTHENTICATION =============================
    public void getAllAuthentication() {
        System.out.println("List of all authentication:");
        authenticationController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteAuthentication() {
        System.out.println("Enter id in order to delete row:");
        String index = scanner.next();
        authenticationController.deleteAuthentication(index);
        ending();
    }

    public void getAuthenticationById() {
        System.out.println("Enter id in order to get authentication:");
        String id = scanner.next();
        try {
            if (authenticationController.getValueByIndex(id) != null)
                System.out.println(authenticationController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== EMPLOYEE ==============================
    public void getAllEmployee() {
        System.out.println("List of all employee:");
        employeeController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteEmployee() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        employeeController.deleteEmployee(index);
        ending();
    }

    public void getEmployeeById() {
        System.out.println("Enter id in order to get employee:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (employeeController.getValueByIndex(id) != null)
                System.out.println(employeeController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== EMPLOYEE_HISTORY ======================
    public void getAllPayment_method() {
        System.out.println("List of all payment_method:");
        payment_methodController.printAll().forEach(System.out::println);
        ending();
    }

    public void deletePayment_method() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        payment_methodController.deletePayment_method(index);
        ending();
    }

    public void getPayment_methodById() {
        System.out.println("Enter id in order to get payment_method:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (payment_methodController.getValueByIndex(id) != null)
                System.out.println(payment_methodController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== PLACE =================================
    public void getAllPlace() {
        System.out.println("List of all place:");
        placeController.printAll().forEach(System.out::println);
        ending();
    }

    public void deletePlace() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        placeController.deletePlace(index);
        ending();
    }

    public void getPlaceById() {
        System.out.println("Enter id in order to get place:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (placeController.getValueByIndex(id) != null)
                System.out.println(placeController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== TIMESLOT ==============================
    public void getAllTimeslot() {
        System.out.println("List of all timeslot:");
        timeslotController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteTimeslot() {
        System.out.println("Enter id in order to delete row:");
        String index = scanner.next();
        timeslotController.deleteTimeslot(index);
        ending();
    }

    public void getTimeslotById() {
        System.out.println("Enter id in order to get timeslot:");
        String id = scanner.next();
        try {
            if (timeslotController.getValueByIndex(id) != null)
                System.out.println(timeslotController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== CONNECTION_METHOD ====================
    public void getAllConnection_method() {
        System.out.println("List of all connection_method:");
        connection_methodController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteConnection_method() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        connection_methodController.deleteConnection_method(index);
        ending();
    }

    public void getConnection_methodById() {
        System.out.println("Enter id in order to get connection_method:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (connection_methodController.getValueByIndex(id) != null)
                System.out.println(connection_methodController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== FEEDBACK ==============================
    public void getAllFeedback() {
        System.out.println("List of all feedback:");
        feedbackController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteFeedback() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        feedbackController.deleteFeedback(index);
        ending();
    }

    public void getFeedbackById() {
        System.out.println("Enter id in order to get feedback:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (feedbackController.getValueByIndex(id) != null)
                System.out.println(feedbackController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== CREDITS ===============================
    public void getAllCredits() {
        System.out.println("List of all credits:");
        creditsController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteCredits() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        creditsController.deleteCredits(index);
        ending();
    }

    public void getCreditsById() {
        System.out.println("Enter id in order to get credits:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (creditsController.getValueByIndex(id) != null)
                System.out.println(creditsController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== SUBSCRIPTION ==========================
    public void getAllSubscription() {
        System.out.println("List of all subscription:");
        subscriptionController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteSubscription() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        subscriptionController.deleteSubscription(index);
        ending();
    }

    public void getSubscriptionById() {
        System.out.println("Enter id in order to get subscription:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (subscriptionController.getValueByIndex(id) != null)
                System.out.println(subscriptionController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== PAYMENT_METHOD ========================
    public void getAllPayment_methods() {
        System.out.println("List of all payment_methods:");
        payment_methodController.printAll().forEach(System.out::println);
        ending();
    }

    public void deletePayment_methods() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        payment_methodController.deletePayment_method(index);
        ending();
    }

    public void getPayment_methodsById() {
        System.out.println("Enter id in order to get payment_methods:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (payment_methodController.getValueByIndex(id) != null)
                System.out.println(payment_methodController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== TOPUP =================================
    public void getAllTopup() {
        System.out.println("List of all topup:");
        topupController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteTopup() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        topupController.deleteTopup(index);
        ending();
    }

    public void getTopupById() {
        System.out.println("Enter id in order to get topup:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (topupController.getValueByIndex(id) != null)
                System.out.println(topupController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== SUBSCRIBE =============================
    public void getAllSubscribe() {
        System.out.println("List of all subscribe:");
        subscribeController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteSubscribe() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        subscribeController.deleteSubscribe(index);
        ending();
    }

    public void getSubscribeById() {
        System.out.println("Enter id in order to get subscribe:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (subscribeController.getValueByIndex(id) != null)
                System.out.println(subscribeController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== CONNECTIONS ===========================
    public void getAllConnection() {
        System.out.println("List of all connection:");
        connectionController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteConnection() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        connectionController.deleteConnection(index);
        ending();
    }

    public void getConnectionById() {
        System.out.println("Enter id in order to get connection:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (connectionController.getValueByIndex(id) != null)
                System.out.println(connectionController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== GAMES =================================
    public void getAllGame() {
        System.out.println("List of all game:");
        gameController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteGame() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        gameController.deleteGame(index);
        ending();
    }

    public void getGameById() {
        System.out.println("Enter id in order to get game:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (gameController.getValueByIndex(id) != null)
                System.out.println(gameController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== COMPUTER ==============================
    public void getAllComputers() {
        System.out.println("List of all computers:");
        computersController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteComputers() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        computersController.deleteComputers(index);
        ending();
    }

    public void getComputersById() {
        System.out.println("Enter id in order to get computers:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (computersController.getValueByIndex(id) != null)
                System.out.println(computersController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================= COMPONENT_LIST =========================
    public void getAllComponents_list() {
        System.out.println("List of all components_list:");
        components_listController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteComponents_list() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        components_listController.deleteComponents_list(index);
        ending();
    }

    public void getComponents_listById() {
        System.out.println("Enter id in order to get components_list:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (components_listController.getValueByIndex(id) != null)
                System.out.println(components_listController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== USER_REQUEST ==========================
    public void getAllUser_request() {
        System.out.println("List of all user_request:");
        user_requestController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteUser_request() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        user_requestController.deleteUser_request(index);
        ending();
    }

    public void getUser_requestById() {
        System.out.println("Enter id in order to get user_request:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (user_requestController.getValueByIndex(id) != null)
                System.out.println(user_requestController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== FIX ===================================
    public void getAllFix() {
        System.out.println("List of all fix:");
        fixController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteFix() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        fixController.deleteFix(index);
        ending();
    }

    public void getFixById() {
        System.out.println("Enter id in order to get fix:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (fixController.getValueByIndex(id) != null)
                System.out.println(fixController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== COMPONENT =============================
    public void getAllComponent() {
        System.out.println("List of all component:");
        componentController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteComponent() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        componentController.deleteComponent(index);
        ending();
    }

    public void getComponentById() {
        System.out.println("Enter id in order to get component:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (componentController.getValueByIndex(id) != null)
                System.out.println(componentController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== WARNING_MESSAGE =======================
    public void getAllWarning_message() {
        System.out.println("List of all warning_message:");
        warning_messageController.printAll().forEach(System.out::println);
        ending();
    }

    public void deleteWarning_message() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        warning_messageController.deleteWarning_message(index);
        ending();
    }

    public void getWarning_messageById() {
        System.out.println("Enter id in order to get warning_message:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (warning_messageController.getValueByIndex(id) != null)
                System.out.println(warning_messageController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
    //========================== PRODUCTS ==============================
    //========================== RECEIPS================================
    //========================== BILING=================================
    //========================== ORDER =================================
    //========================== SERVE =================================


    //========================== CUSTOMERS =============================
    //========================== CUSTOMERS =============================
    //========================== CUSTOMERS =============================



    /*
    public void getAllmaj() {
        System.out.println("List of all min:");
        minController.printAll().forEach(System.out::println);
        ending();
    }

    public void deletemaj() {
        System.out.println("Enter id in order to delete row:");
        Long index = Long.parseLong(scanner.next());
        minController.deletemaj(index);
        ending();
    }

    public void getmajById() {
        System.out.println("Enter id in order to get min:");
        Long id = Long.parseLong(scanner.next());
        try {
            if (minController.getValueByIndex(id) != null)
                System.out.println(minController.getValueByIndex(id).toString());

        } catch (NullPointerException e) {
            System.out.println("There is no such number " +
                    "\nTry one more time, please");
        }
        ending();
    }
  */
}