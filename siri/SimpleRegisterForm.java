import javax.swing.*;

public class SimpleRegisterForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Register Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 160, 25);
        frame.add(userText);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 60, 160, 25);
        frame.add(passText);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(100, 100, 100, 30);
        frame.add(registerButton);

        frame.setVisible(true);
    }
}
