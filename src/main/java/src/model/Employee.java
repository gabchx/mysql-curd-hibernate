package src.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long employee_id;

    @ManyToOne(targetEntity = Place.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "place_id")
    private Place place_id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @Column(name = "salary")
    private String salary;

    @ManyToOne(targetEntity = Timeslot.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "timeslot_id")
    private Timeslot timeslot_id;

    // Constructor
    public Employee(Place place_id, String name, String title, String salary, Timeslot timeslot_id) {
        this.place_id = place_id;
        this.title = title;
        this.salary = salary;
        this.timeslot_id = timeslot_id;
        this.name = name;
    }

    public Employee(Long employee_id, Place place_id, String name, String title, String salary, Timeslot timeslot_id) {
        this.employee_id = employee_id;
        this.place_id = place_id;
        this.title = title;
        this.salary = salary;
        this.timeslot_id = timeslot_id;
        this.name = name;
    }

    public Employee() {
    }

    public String toString() {
        return employee_id + "   " + place_id + "   " + name + "   " + title + "   " + salary + "   " + timeslot_id;
    }
}
