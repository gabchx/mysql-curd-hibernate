package src.view;

public class Menu {


    public void displayMenu() {
        System.out.println("                                                                         ");
        System.out.println(" _______________________________________________________________________");
        System.out.println("|                                                                       |");
        System.out.println("|       Enter any combination of existing entity and CRUD number :      |");
        System.out.println("|_______________________________________________________________________|");
        System.out.println("|                                  |                                    |");
        System.out.println("|            entity:               |                CRUD:               |");
        System.out.println("|__________________________________|____________________________________|");
        System.out.println("|   |                              |   |                                |");
        System.out.println("| 1 | costumer                     | 1 | GET ALL                        |");
        System.out.println("| 2 | authentification             | 2 | GET ONE BY ID                  |");
        System.out.println("| 3 |                              | 3 | CREATE                         |");
        System.out.println("| 4 |                              | 4 | UPDATE                         |");
        System.out.println("| 5 |                              | 5 | DELETE                         |");
        System.out.println("| 6 |                              |   |                                |");
        System.out.println("|___|______________________________|___|________________________________|");
        System.out.println("|             Mapping 'M'      Seeding  'S'      Both 'MS'              |");
        System.out.println("|_______________________________________________________________________|");
    }
}