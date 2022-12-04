package src.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long product_id;

    @ManyToOne(targetEntity = Place.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "place_id")
    private Place place_id;

    @Column(name = "type")
    private String type;

    @ManyToOne(targetEntity = Recipe.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "recipe_id")
    private Recipe recipe_id;

    @Column(name = "age_limite")
    private String age_limite;

    @Column(name = "price")
    private Integer price;

    @Column(name = "caption")
    private String caption;

    // Constructor
    public Product(Place place_id, String type, Recipe recipe_id, String age_limite, Integer price, String caption) {
        this.place_id = place_id;
        this.type = type;
        this.recipe_id = recipe_id;
        this.age_limite = age_limite;
        this.price = price;
        this.caption = caption;
    }

    public Product(Long product_id, Place place_id, String type, Recipe recipe_id, String age_limite, Integer price,
            String caption) {
        this.product_id = product_id;
        this.place_id = place_id;
        this.type = type;
        this.recipe_id = recipe_id;
        this.age_limite = age_limite;
        this.price = price;
        this.caption = caption;
    }

    public Product() {
    }

    public String toString() {
        return product_id + "   " + place_id + "   " + type + "   " + recipe_id + "   " + age_limite + "   " + price
                + "   " + caption;
    }
}
