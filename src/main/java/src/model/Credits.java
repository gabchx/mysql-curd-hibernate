package src.model;

import javax.persistence.*;

@Entity
@Table(name = "credits")
public class Credits {

    @Id
    @Column(name = "credits_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long credits_id;
    @Column(name = "price")
    private Integer price;

    @Column(name = "time")
    private Integer time;

    // Constructor
    public Credits(Integer price, Integer time) {
        this.price = price;
        this.time = time;
    }

    public Credits(Long credits_id, Integer price, Integer time) {
        this.credits_id = credits_id;
        this.price = price;
        this.time = time;
    }

    public Credits() {
    }

    public String toOneString(){
        return credits_id+"";
    }
    public String toString() {
        return credits_id + "   " + price + "   " + time;
    }
}
