package src.model;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier {

    @Id
    @Column(name = "supplier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long supplier_id;
    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "score")
    private Integer score;

    // Constructor
    public Supplier(String name, String phone_number, Integer score) {
        this.name = name;
        this.phone_number = phone_number;
        this.score = score;
    }

    public Supplier(Long supplier_id, String name, String phone_number, Integer score) {
        this.supplier_id = supplier_id;
        this.name = name;
        this.phone_number = phone_number;
        this.score = score;
    }

    public Supplier() {
    }

    public String toOneString(){
        return name+"";
    }

    public String toString() {
        return supplier_id + "   " + name + "   " + phone_number + "   " + score;
    }
}
