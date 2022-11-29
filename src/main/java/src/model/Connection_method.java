package src.model;

import javax.persistence.*;

@Entity
@Table(name = "connection_methods")
public class Connection_method {

    @Id
    @Column(name = "connection_methods_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long connection_methods_id;

    @Column(name = "description")
    private String description;

    // Constructor
    public Connection_method(String description) {
        this.description = description;
    }

    public Connection_method(Long connection_methods_id, String description) {
        this.connection_methods_id = connection_methods_id;
        this.description = description;
    }

    public Connection_method() {
    }

    public String toString() {
        return connection_methods_id + "   " + description;
    }
}
