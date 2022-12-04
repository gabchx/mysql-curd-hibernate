package src.model;

import javax.persistence.*;

@Entity
@Table(name = "serve")
public class Serve {

    @Id
    @Column(name = "serve_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long serve_id;

    @ManyToOne(targetEntity = Billing.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "biling_id")
    private Billing billing_id;

    @ManyToOne(targetEntity = Employee.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "employee_id")
    private Employee employee_id;

    @ManyToOne(targetEntity = Feedback.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "feedback_id")
    private Feedback feedback_id;

    // Constructor
    public Serve(Long serve_id, Billing billing_id, Employee employee_id, Feedback feedback_id) {
        this.serve_id = serve_id;
        this.billing_id = billing_id;
        this.employee_id = employee_id;
        this.feedback_id = feedback_id;
    }

    public Serve(Billing billing_id, Employee employee_id, Feedback feedback_id) {
        this.billing_id = billing_id;
        this.employee_id = employee_id;
        this.feedback_id = feedback_id;
    }

    public Serve() {
    }

    public String toString() {
        return serve_id + "   " + billing_id + "   " + employee_id + "   " + feedback_id;
    }
}
