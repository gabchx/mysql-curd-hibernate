package src.model;
import javax.persistence.*;


@Entity
@Table (name = "customers")
public class Customer {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long user_id;
    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToOne(targetEntity = Authentication.class,cascade = CascadeType.REMOVE)
    @JoinColumn(name ="authentication_details")
    private Authentication authentication;

    @Column(name = "birthdate", length = 8)
    private Integer birthdate;

    @Column(name = "time_left")
    private Integer time_left;

    //Constructor
    public Customer(String name, String email, Authentication authentication, Integer birthdate, Integer time_left){
        this.name = name;
        this.email = email;
        this.authentication = authentication;
        this.birthdate = birthdate;
        this.time_left = time_left;
    }
    public Customer(Long user_id, String name, String email, Authentication authentication, Integer birthdate, Integer time_left){
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.authentication = authentication;
        this.birthdate = birthdate;
        this.time_left = time_left;
    }

    public Customer(){}

    public Authentication getAuthentication(){
        return this.authentication;
    }

    public String toString() {
        return "   " + user_id +"   "+ name +"   "+ email +"   "+ authentication +"   "+ birthdate +"   "+birthdate + "   "+ time_left;
    }
}
