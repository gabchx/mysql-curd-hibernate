package src.model;

import javax.persistence.*;

@Entity
@Table(name = "computers")
public class Computers {

    @Id
    @Column(name = "computers_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long computers_id;

    @ManyToOne(targetEntity = Place.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "place_id")
    private Place place_id;

    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "appointed_technician")
    private Employee appointed_technician;

    @Column(name = "creation_date")
    private Integer creation_date;

    @ManyToOne(targetEntity = Components_list.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "components_list")
    private Components_list components_list_id;

    // Constructor
    public Computers(Place place_id, Employee appointed_technician, Integer creation_date,
            Components_list components_list_id) {
        this.place_id = place_id;
        this.appointed_technician = appointed_technician;
        this.creation_date = creation_date;
        this.components_list_id = components_list_id;
    }

    public Computers(Long computers_id, Place place_id, Employee appointed_technician, Integer creation_date,
            Components_list components_list_id) {
        this.computers_id = computers_id;
        this.place_id = place_id;
        this.appointed_technician = appointed_technician;
        this.creation_date = creation_date;
        this.components_list_id = components_list_id;
    }

    public Computers() {
    }

    public String toString() {
        return computers_id + "   " + place_id + "   " + appointed_technician + "   " + creation_date + "   "
                + components_list_id;
    }
}
