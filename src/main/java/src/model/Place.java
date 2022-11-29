package src.model;
import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @Column(name = "place_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long place_id;
    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    @Column(name = "description")
    private String description;

    // Constructor
    public Place(String name, String adress, String description) {
        this.name = name;
        this.adress = adress;
        this.description = description;
    }

    public Place(Long place_id, String name, String adress, String description) {
        this.place_id = place_id;
        this.name = name;
        this.adress = adress;
        this.description = description;
    }

    public Place() {
    }

    public String toString() {
        return place_id + "   " + name + "   " + adress + "   " + description + "   ";
    }
}
