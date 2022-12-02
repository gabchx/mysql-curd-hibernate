package src.model;

import javax.persistence.*;

@Entity
@Table(name = "user_request")
public class User_request {

    @Id
    @Column(name = "user_request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long user_request_id;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer")
    private Customer customer;

    @Column(name = "message")
    private String message;

    // Constructor
    public User_request(Customer customer, String message) {
        this.customer = customer;
        this.message = message;
    }

    public User_request(Long user_request_id, Customer customer, String message) {
        this.user_request_id = user_request_id;
        this.customer = customer;
        this.message = message;
    }

    public User_request() {
    }

    public String toString() {
        return user_request_id + "   " + customer + "   " + message;
    }
}
