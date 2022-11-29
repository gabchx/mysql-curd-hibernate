package src.model;

import javax.persistence.*;

@Entity
@Table(name = "payment_method")
public class Payment_method {

    @Id
    @Column(name = "payment_method_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long payment_method_id;

    @Column(name = "desciption")
    private String desciption;

    @Column(name = "taxs")
    private Integer taxs;

    // Constructor
    public Payment_method(String desciption, Integer taxs) {
        this.desciption = desciption;
        this.taxs = taxs;
    }

    public Payment_method(Long payment_method_id, String desciption, Integer taxs) {
        this.payment_method_id = payment_method_id;
        this.desciption = desciption;
        this.taxs = taxs;
    }

    public Payment_method() {
    }

    public String toString() {
        return payment_method_id + "   " + desciption + "   " + taxs;
    }
}
