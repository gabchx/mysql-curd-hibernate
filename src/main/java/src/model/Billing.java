package src.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "billing")
public class Billing {

    @Id
    @Column(name = "billing_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long billing_id;

    @Column(name = "total_amount")
    private Integer total_amount;

    @Column(name = "tips")
    private String tips;

    @ManyToOne(targetEntity = Payment_method.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "payment_method")
    private Payment_method payment_method;

    @Column(name = "payment_details")
    private String payment_details;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    // Constructor
    public Billing(Integer total_amount, String tips, Payment_method payment_method, String payment_details, Date date) {
        this.total_amount = total_amount;
        this.tips = tips;
        this.payment_method = payment_method;
        this.payment_details = payment_details;
        this.date = date;
    }

    public Billing(Long billing_id, Integer total_amount, String tips, Payment_method payment_method,
                   String payment_details, Date date) {
        this.billing_id = billing_id;
        this.total_amount = total_amount;
        this.tips = tips;
        this.payment_method = payment_method;
        this.payment_details = payment_details;
        this.date = date;
    }

    public Billing() {
    }
    public String toOneString(){
        return billing_id+"";
    }
    public String toString() {
        return billing_id + "   " + total_amount + "   " + tips + "   " + payment_method.toOneString() + "   " + payment_details;
    }
}
