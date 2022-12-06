package src.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "subscribe")
public class Subscribe {

    @Id
    @Column(name = "subscribe_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long subscribe_id;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private Customer user;

    @ManyToOne(targetEntity = Subscription.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "subscription_id")
    private Subscription subscription;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @ManyToOne(targetEntity = Payment_method.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "payment_method")
    private Payment_method payment_method;

    @Column(name = "payment_details")
    private String payment_details;

    // Constructor
    public Subscribe(Customer user, Subscription subscription, Date date, Payment_method payment_method,
            String payment_details) {
        this.user = user;
        this.subscription = subscription;
        this.date = date;
        this.payment_method = payment_method;
        this.payment_details = payment_details;
    }

    public Subscribe(Long subscribe_id, Customer user, Subscription subscription, Date date,
            Payment_method payment_method, String payment_details) {
        this.subscribe_id = subscribe_id;
        this.user = user;
        this.subscription = subscription;
        this.date = date;
        this.payment_method = payment_method;
        this.payment_details = payment_details;
    }

    public Subscribe() {
    }

    public String toOneString(){
        return subscribe_id+"";
    }

    public String toString() {
        return subscribe_id + "   " + user.toOneString() + "   " + subscription.toOneString() + "   " + date + "   " + payment_method.toOneString() + "   "
                + payment_details;
    }
}
