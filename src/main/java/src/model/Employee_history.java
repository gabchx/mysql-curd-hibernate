package src.model;

import javax.persistence.*;

@Entity
@Table(name = "employee_history")
public class Employee_history {

    @Id
    @Column(name = "employee_history_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long employee_history_id;

    @Column(name = "place_id")
    private Long place_id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "salary")
    private String salary;

    @Column(name = "time_slot_id")
    private String time_slot_id;

    // Constructor
    public Employee_history(Long place_id, String name, String title, String salary, String time_slot_id) {
        this.place_id = place_id;
        this.title = title;
        this.salary = salary;
        this.time_slot_id = time_slot_id;
        this.name = name;
    }

    public Employee_history(Long employee_history_id, Long place_id, String name, String title, String salary, String time_slot_id) {
        this.employee_history_id = employee_history_id;
        this.place_id = place_id;
        this.title = title;
        this.salary = salary;
        this.time_slot_id = time_slot_id;
        this.name = name;
    }

    public Employee_history() {
    }

    public String toString() {
        return employee_history_id + "   " + place_id + "   " + name + "   " + title + "   " + salary + "   "
                + time_slot_id;
    }
}
