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

    @Column(name = "type")
    private String type;

    // Constructor
    public Feedback(String note, String message, String type) {
        this.note = note;
        this.message = message;
        this.type = type;
    }

    public Feedback(Long feedback_id, String note, String message, String type) {
        this.feedback_id = feedback_id;
        this.note = note;
        this.message = message;
        this.type = type;
    }

    public Feedback() {
    }

    public String toOneString(){
        return feedback_id+"";
    }

    public String toString() {
        return feedback_id + "   " + note + "    " + message+"   "+type;
    }
}
