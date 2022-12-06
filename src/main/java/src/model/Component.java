package src.model;

import javax.persistence.*;

@Entity
@Table(name = "component_id")
public class Component {

    @Id
    @Column(name = "component_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long component_id;

    @ManyToOne(targetEntity = Place.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "place_id")
    private Place place_id;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity_in_stock")
    private Integer quantity_in_stock;

    @Column(name = "price")
    private Integer price;

    // Constructor
    public Component(Place place_id, String type, String description, Integer quantity_in_stock, Integer price) {
        this.place_id = place_id;
        this.type = type;
        this.description = description;
        this.quantity_in_stock = quantity_in_stock;
        this.price = price;
    }

    public Component(Long component_id, Place place_id, String type, String description, Integer quantity_in_stock,
            Integer price) {
        this.component_id = component_id;
        this.place_id = place_id;
        this.type = type;
        this.description = description;
        this.quantity_in_stock = quantity_in_stock;
        this.price = price;
    }

    public Component() {
    }

    public String toOneString(){
        return type+"";
    }

    public String toString() {
        return component_id + "   " + place_id.toOneString() + "   " + type + "   " + description + "   " + quantity_in_stock + "   "
                + price;
    }
}
