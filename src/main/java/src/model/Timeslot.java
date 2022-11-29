package src.model;

import javax.persistence.*;

@Entity
@Table(name = "timeslot")
public class Timeslot {

    @Id
    @Column(name = "timeslot_id")
    protected String timeslot_id;
    @Column(name = "day")
    private String day;

    @Column(name = "start_time")
    private String start_time;

    @Column(name = "end_time")
    private String end_time;

    // Constructor
    public Timeslot(String day, String start_time, String end_time) {
        this.day = day;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Timeslot(String timeslot_id, String day, String start_time, String end_time) {
        this.timeslot_id = timeslot_id;
        this.day = day;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public Timeslot() {
    }

    public String toString() {
        return timeslot_id + "   " + day + "   " + start_time + "   " + end_time + "   ";
    }
}
