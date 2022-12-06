package src.model;

import javax.persistence.*;

@Entity
@Table(name = "connection")
public class Connection {

    @Id
    @Column(name = "connection_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long connection_id;

    @ManyToOne(targetEntity = Customer.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user")
    private Customer user;

    @ManyToOne(targetEntity = Computers.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "computer")
    private Computers computer;

    @ManyToOne(targetEntity = Connection_method.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "connection_method")
    private Connection_method connection_method;

    @Column(name = "duration")
    private Integer duration;

    @ManyToOne(targetEntity = Feedback.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "feedback")
    private Feedback feedback;

    // Constructor
    public Connection(Customer user, Computers computer, Connection_method connection_method, Integer duration, Feedback feedback) {
        this.user = user;
        this.computer = computer;
        this.connection_method = connection_method;
        this.duration = duration;
        this.feedback = feedback;
    }

    public Connection(Long connection_id,Customer user, Computers computer, Connection_method connection_method, Integer duration,
            Feedback feedback) {
        this.connection_id = connection_id;
        this.user = user;
        this.computer = computer;
        this.connection_method = connection_method;
        this.duration = duration;
        this.feedback = feedback;
    }

    public Connection() {
    }
    public String toOneString(){
        return connection_id+"";
    }

    public String toString() {
        return connection_id + "   "+ user.toOneString() +"   "+ computer.toOneString() + "   " + connection_method.toOneString() + "   " + duration + "   " + feedback.toOneString();
    }
}
