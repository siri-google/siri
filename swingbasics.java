import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingbasics {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Swing Form");
        jf.setSize(500, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JLabel l1 = new JLabel("Full Name:");
        l1.setBounds(30, 30, 100, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 200, 30);

        JLabel l2 = new JLabel("College Name:");
        l2.setBounds(30, 80, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(150, 80, 200, 30);

        JLabel l3 = new JLabel("Department:");
        l3.setBounds(30, 130, 100, 30);
        String[] departments = {"Computer Science", "Electrical", "Mechanical", "Civil", "Electronics"};
        JComboBox<String> departmentSelector = new JComboBox<>(departments);
        departmentSelector.setBounds(150, 130, 200, 30);

        JLabel l4 = new JLabel("Select Year:");
        l4.setBounds(30, 180, 100, 30);
        JRadioButton rb1 = new JRadioButton("Fy");
        rb1.setBounds(150, 180, 60, 30);
        JRadioButton rb2 = new JRadioButton("Sy");
        rb2.setBounds(220, 180, 60, 30);
        JRadioButton rb3 = new JRadioButton("Ty");
        rb3.setBounds(290, 180, 60, 30);
        JRadioButton rb4 = new JRadioButton("BTech");
        rb4.setBounds(360, 180, 70, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        JLabel l5 = new JLabel("Select Honors:");
        l5.setBounds(30, 230, 100, 30);
        JCheckBox cb1 = new JCheckBox("AIML");
        cb1.setBounds(150, 230, 100, 30);
        JCheckBox cb2 = new JCheckBox("CyberSecurity");
        cb2.setBounds(260, 230, 100, 30);

        JButton b1 = new JButton("Clear");
        b1.setBounds(150, 280, 100, 30);
        JButton b2 = new JButton("Submit");
        b2.setBounds(260, 280, 100, 30);


//combo box add


        c.add(l1);
        c.add(t1);
        c.add(l2);
        c.add(t2);
        c.add(l3);
        c.add(departmentSelector); // Added department selector
        c.add(l4);
        c.add(rb1);
        c.add(rb2);
        c.add(rb3);
        c.add(rb4);
        c.add(l5);
        c.add(cb1);
        c.add(cb2);
        c.add(b1);
        c.add(b2);



        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                departmentSelector.setSelectedIndex(0); // Reset dropdown selection
                bg.clearSelection();
                cb1.setSelected(false);
                cb2.setSelected(false);
            }
        });
    }
}

