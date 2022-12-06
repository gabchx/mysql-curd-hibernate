package src.model;

import javax.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @Column(name = "recipe_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long recipe_id;

    @Column(name = "cooking_way")
    private String cooking_way;

    @Column(name = "cooking_time")
    private Integer cooking_time;

    @Column(name = "advice")
    private String advice;

    // Constructor
    public Recipe(String cooking_way, Integer cooking_time, String advice) {
        this.cooking_way = cooking_way;
        this.cooking_time = cooking_time;
        this.advice = advice;
    }

    public Recipe(Long recipe_id, String cooking_way, Integer cooking_time, String advice) {
        this.recipe_id = recipe_id;
        this.cooking_way = cooking_way;
        this.cooking_time = cooking_time;
        this.advice = advice;
    }

    public Recipe() {
    }

    public String toOneString(){
        return recipe_id+"";
    }

    public String toString() {
        return recipe_id + "   " + cooking_way + "   " + cooking_time + "   " + advice;
    }
}
