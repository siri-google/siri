import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginSignupApp {
    // Database credentials
    private static final String DB_URL = "jdbc:mysql://localhost:3306/user_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "suraj";

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create GUI components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton signinButton = new JButton("Sign In");

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(signinButton);

        // Add action listener for the Sign In button
        signinButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());
            if (validateLogin(username, password)) {
                JOptionPane.showMessageDialog(frame, "User has logged in!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password!");
            }
        });

        frame.setVisible(true);
    }

    // Method to validate login credentials
    private static boolean validateLogin(String username, String password) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // Return true if a match is found
        } catch (SQLException ex) {
            System.err.println("Error during login: " + ex.getMessage());
            return false;
        }
    }
}

