package src.model;

import javax.persistence.*;
import javax.swing.text.html.HTMLDocument.BlockElement;

@Entity
@Table(name = "warning_message")
public class Warning_message {

    @Id
    @Column(name = "warning_message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long warning_message_id;

    @Column(name = "message")
    private String message;

    @Column(name = "on_voice")
    private Boolean on_voice;

    // Constructor
    public Warning_message(String message, Boolean on_voice) {
        this.message = message;
        this.on_voice = on_voice;
    }

    public Warning_message(Long warning_message_id, String message, Boolean on_voice) {
        this.warning_message_id = warning_message_id;
        this.message = message;
        this.on_voice = on_voice;
    }

    public Warning_message() {
    }

    public String toString() {
        return warning_message_id + "   " + message + "   " + on_voice;
    }
}
