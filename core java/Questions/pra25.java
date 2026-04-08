package Questions;

import javax.swing.*;
import java.awt.event.*;

public class pra25 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Candidate Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 30, 150, 25);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 70, 100, 25);
        JTextField ageField = new JTextField();
        ageField.setBounds(160, 70, 150, 25);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 110, 100, 25);
        JTextField cityField = new JTextField();
        cityField.setBounds(160, 110, 150, 25);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 150, 100, 25);
        JTextField mobileField = new JTextField();
        mobileField.setBounds(160, 150, 150, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 190, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(160, 190, 150, 25);

        JLabel designationLabel = new JLabel("Designation:");
        designationLabel.setBounds(50, 230, 100, 25);
        JTextField designationField = new JTextField();
        designationField.setBounds(160, 230, 150, 25);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(160, 280, 100, 30);

        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(50, 320, 300, 25);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(cityLabel);
        frame.add(cityField);
        frame.add(mobileLabel);
        frame.add(mobileField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(designationLabel);
        frame.add(designationField);
        frame.add(submitButton);
        frame.add(messageLabel);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Name: " + nameField.getText() +
                              ", Age: " + ageField.getText() +
                              ", City: " + cityField.getText() +
                              ", Mobile: " + mobileField.getText() +
                              ", Email: " + emailField.getText() +
                              ", Designation: " + designationField.getText();
                messageLabel.setText("Registered: " + data);
            }
        });
    }
}
