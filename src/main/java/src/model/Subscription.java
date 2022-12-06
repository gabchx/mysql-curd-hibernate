package src.model;

import javax.persistence.*;

@Entity
@Table(name = "subscription")
public class Subscription {

    @Id
    @Column(name = "subscription_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long subscription_id;
    @Column(name = "time_per_month")
    private Integer time_per_month;

    @Column(name = "price_per_month")
    private Integer price_per_month;

    // Constructor
    public Subscription(Integer time_per_month, Integer price_per_month) {
        this.time_per_month = time_per_month;
        this.price_per_month = price_per_month;
    }

    public Subscription(Long subscription_id, Integer time_per_month, Integer price_per_month) {
        this.subscription_id = subscription_id;
        this.time_per_month = time_per_month;
        this.price_per_month = price_per_month;
    }

    public Subscription() {
    }

    public String toOneString(){
        return subscription_id+"";
    }

    public String toString() {
        return subscription_id + "   " + time_per_month + "   " + price_per_month;
    }
}
