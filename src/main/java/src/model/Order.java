package src.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long order_id;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_id")
    private Customer customer_id;

    @ManyToOne(targetEntity = Product.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id")
    private Product product_id;

    @ManyToOne(targetEntity = Billing.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "billing_id")
    private Billing billing_id;

    @Column(name="ok")
    private String ok;

    // Constructor
    public Order(Customer customer_id, Product product_id, Billing billing_id) {
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.billing_id = billing_id;
    }

    public Order(Long order_id, Customer customer_id, Product product_id, Billing billing_id) {
        this.order_id = order_id;
        this.customer_id = customer_id;
        this.product_id = product_id;
        this.billing_id = billing_id;
    }

    public Order() {
    }

    public String toString() {
        return order_id + "   " + customer_id + "   " + product_id + "   " + billing_id;
    }
}
