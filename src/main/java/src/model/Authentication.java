package src.model;

import javax.persistence.*;

@Entity
@Table(name = "authentication")
public class Authentication {

    @Id
    @Column(name = "user_name")
    protected String user_name;
    @Column(name = "password_hash")
    private String password_hash;

    // Constructor
    public Authentication(String password_hash) {
        this.password_hash = password_hash;
    }

    public Authentication(String user_name, String password_hash) {
        this.user_name = user_name;
        this.password_hash = password_hash;
    }

    public Authentication() {
    }

    public String getUser_name(){
        return user_name;
    }

    public String toString() {
        return user_name + "   " + password_hash;
    }
}
