package src.model;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @Column(name = "game_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long game_id;

    @Column(name = "name")
    private String name;

    @Column(name = "caption")
    private String caption;

    @Column(name = "type")
    private String type;

    @ManyToOne(targetEntity = Place.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "place_id")
    private Place place_id;

    @Column(name = "is_download")
    private Boolean is_download;

    // Constructor
    public Game(String name, String caption, String type, Place place_id, Boolean is_download) {
        this.name = name;
        this.caption = caption;
        this.type = type;
        this.place_id = place_id;
        this.is_download = is_download;
    }

    public Game(Long game_id, String caption, String type, Place place_id, Boolean is_download) {
        this.game_id = game_id;
        this.name = name;
        this.caption = caption;
        this.type = type;
        this.place_id = place_id;
        this.is_download = is_download;
    }

    public Game() {
    }
    public String toOneString(){
        return name+"";
    }
    public String toString() {
        return game_id + "   " + name + "   " + caption + "   " + type + "   " + place_id.toOneString() + "   " + is_download;
    }
}
