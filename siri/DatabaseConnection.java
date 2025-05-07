import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args) {
        // MySQL Database Credentials
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";  // Change if your MySQL username is different
        String password = "bugsploit"; // Change this to your actual password

        try {
            // Step 1: Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL successfully!");

            // Step 2: Create Statement Object
            Statement stmt = conn.createStatement();

            // Step 3: Execute Query
            String sql = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            // Step 4: Display Query Results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Step 5: Close Connection
            conn.close();
            System.out.println("Connection closed.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}