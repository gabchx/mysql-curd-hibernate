package src.bdextra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Trigger {

    public static String create() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pcbang-chain", "javapp", "azerty123&é\"");
            Statement stmt = con.createStatement();
            stmt.execute("CREATE TRIGGER employeeDelete BEFORE DELETE ON employee " //
                    + "FOR EACH ROW "//
                    + "BEGIN "//
                    + "INSERT INTO employee_history (employee_history_id, name, place_id, salary, time_slot_id, title)"//
                    + "VALUES (OLD.employee_id, OLD.name, OLD.place_id, OLD.salary, OLD.timeslot_id, OLD.title);"//
                    + "END;");
            con.close();
        } catch (SQLException e) {
            return e.getMessage();
        }
        return "Trigger created!";
    }
}
