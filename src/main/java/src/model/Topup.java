package src.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "topup")
public class Topup {

    @Id
    @Column(name = "topup_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long topup_id;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private Customer user;

    @ManyToOne(targetEntity = Credits.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "credits_id")
    private Credits credits;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(targetEntity = Payment_method.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "payment_method")
    private Payment_method payment_method;

    @Column(name = "payment_details")
    private String payment_details;

    //Constructor
    public Topup(Customer user, Credits credits, Date date, Payment_method payment_method, String payment_details ){
        this.user = user;
        this.credits = credits;
        this.date = date;
        this.payment_method = payment_method;
        this.payment_details = payment_details;
    }

    public Topup(Long topup_id, Customer user, Credits credits, Date date, Payment_method payment_method, String payment_details ){
        this.topup_id = topup_id;
        this.user = user;
        this.credits = credits;
        this.date = date;
        this.payment_method = payment_method;
        this.payment_details = payment_details;
    }

    public Topup() {
    }

    public String toOneString(){
        return topup_id+"";
    }

    public String toString() {
        return topup_id + "   " + user.toOneString() + "   " + credits.toOneString() + "   " + date + "   " + payment_method.toOneString() + "   " + payment_details;
    }
}
