package src.model;

import javax.persistence.*;

@Entity
@Table(name = "fix")
public class Fix {

    @Id
    @Column(name = "fix_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long fix_id;

    @ManyToOne(targetEntity = Computers.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "computer")
    private Computers computer;

    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "technician")
    private Employee technician;

    @Column(name = "category")
    private String category;

    @Column(name = "details")
    private String details;

    // Constructor
    public Fix(Computers computer, Employee technician, String category, String details) {
        this.computer = computer;
        this.technician = technician;
        this.category = category;
        this.details = details;
    }

    public Fix(Long fix_id, Computers computer, Employee technician, String category, String details) {
        this.fix_id = fix_id;
        this.computer = computer;
        this.technician = technician;
        this.category = category;
        this.details = details;
    }

    public Fix() {
    }

    public String toString() {
        return fix_id + "   " + computer + "   " + technician + "   " + category + "   " + details;
    }
}
