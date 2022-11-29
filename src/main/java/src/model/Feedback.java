package src.model;

import javax.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @Column(name = "feedback_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long feedback_id;
    @Column(name = "note")
    private String note;

    @Column(name = "message")
    private String message;

    // Constructor
    public Feedback(String note, String message) {
        this.note = note;
        this.message = message;
    }

    public Feedback(Long feedback_id, String note, String message) {
        this.feedback_id = feedback_id;
        this.note = note;
        this.message = message;
    }

    public Feedback() {
    }

    public String toString() {
        return feedback_id + "   " + note + "    " + message;
    }
}
