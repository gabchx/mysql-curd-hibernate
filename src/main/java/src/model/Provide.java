package src.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "provide")
public class Provide {

    @Id
    @Column(name = "provide_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long provide_id;

    @ManyToOne(targetEntity = Supplier.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier_id;

    @ManyToOne(targetEntity = Product.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "product_id")
    private Product product_id;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    // Constructor
    public Provide(Supplier supplier_id, Product product_id, Date date) {
        this.supplier_id = supplier_id;
        this.product_id = product_id;
        this.date = date;
    }

    public Provide(Long provide_id, Supplier supplier_id, Product product_id, Date date) {
        this.provide_id = provide_id;
        this.supplier_id = supplier_id;
        this.product_id = product_id;
        this.date = date;
    }

    public Provide() {
    }

    public String toString() {
        return provide_id + "   " + supplier_id + "   " + product_id + "   " + date;
    }
}
