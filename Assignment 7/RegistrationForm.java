import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
        TitledBorder borderTitled = BorderFactory.createTitledBorder("User Registration");
        borderTitled.setTitleJustification(TitledBorder.CENTER);
        panel.setBorder(borderTitled);
        JLabel name = new JLabel("Name:");
        JLabel email = new JLabel("Email:");
        JLabel password = new JLabel("Password:");
        JLabel confirm = new JLabel("Confirm Password:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JPasswordField confirmField = new JPasswordField(15);
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        panel.add(name);
        panel.add(nameField);
        panel.add(email);
        panel.add(emailField);
        panel.add(password);
        panel.add(passwordField);
        panel.add(confirm);
        panel.add(confirmField);
        panel.add(submit);
        panel.add(clear);
        frame.add(panel);
        frame.setVisible(true);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmField.getPassword());

                if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(frame, "Invalid email address.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    String message = "Name: " + name + "\nEmail: " + email +
                            "\nPassword: " + password + "\nConfirm Password: " + confirmPassword;
                    JOptionPane.showMessageDialog(frame, message, "Registration Details",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                emailField.setText("");
                passwordField.setText("");
                confirmField.setText("");
            }
        });
    }
}
