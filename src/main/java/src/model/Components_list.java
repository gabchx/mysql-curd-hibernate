package src.model;

import javax.persistence.*;

@Entity
@Table(name = "components_list")
public class Components_list {

    @Id
    @Column(name = "components_list_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long components_list_id;

    @ManyToOne(targetEntity = Component.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "screen_id")
    private Component screen_id;

    @ManyToOne(targetEntity = Component.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "keyboard_id")
    private Component keyboard_id;

    @ManyToOne(targetEntity = Component.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "mouse_id")
    private Component mouse_id;

    @ManyToOne(targetEntity = Component.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "headphone_id")
    private Component headphone_id;

    @ManyToOne(targetEntity = Component.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tower_id")
    private Component tower_id;

    // Constructor
    public Components_list(Component screen_id, Component keyboard_id, Component mouse_id, Component headphone_id,
            Component tower_id) {
        this.screen_id = screen_id;
        this.keyboard_id = keyboard_id;
        this.mouse_id = mouse_id;
        this.headphone_id = headphone_id;
        this.tower_id = tower_id;
    }

    public Components_list(Long components_list_id, Component screen_id, Component keyboard_id, Component mouse_id,
            Component headphone_id, Component tower_id) {
        this.components_list_id = components_list_id;
        this.screen_id = screen_id;
        this.keyboard_id = keyboard_id;
        this.mouse_id = mouse_id;
        this.headphone_id = headphone_id;
        this.tower_id = tower_id;
    }

    public Components_list() {
    }

    public String toString() {
        return components_list_id + "   " + screen_id + "   " + keyboard_id + "   " + mouse_id + "   " + headphone_id
                + "   " + tower_id;
    }
}
