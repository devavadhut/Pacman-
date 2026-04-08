package Questions;

import javax.swing.*;
import java.awt.event.*;

public class pra26 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");

        JLabel rollLabel = new JLabel("Roll No:");
        rollLabel.setBounds(50, 30, 100, 25);
        JTextField rollField = new JTextField();
        rollField.setBounds(160, 30, 150, 25);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 70, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 70, 150, 25);

        JLabel collegeLabel = new JLabel("College:");
        collegeLabel.setBounds(50, 110, 100, 25);
        JTextField collegeField = new JTextField();
        collegeField.setBounds(160, 110, 150, 25);

        JLabel classLabel = new JLabel("Class:");
        classLabel.setBounds(50, 150, 100, 25);
        JTextField classField = new JTextField();
        classField.setBounds(160, 150, 150, 25);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 190, 100, 25);
        JTextField genderField = new JTextField();
        genderField.setBounds(160, 190, 150, 25);

        JLabel mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 230, 100, 25);
        JTextField mobileField = new JTextField();
        mobileField.setBounds(160, 230, 150, 25);

        JLabel aadharLabel = new JLabel("Aadhar:");
        aadharLabel.setBounds(50, 270, 100, 25);
        JTextField aadharField = new JTextField();
        aadharField.setBounds(160, 270, 150, 25);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 310, 100, 25);
        JTextField cityField = new JTextField();
        cityField.setBounds(160, 310, 150, 25);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(160, 350, 100, 30);

        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(50, 390, 300, 25);

        frame.add(rollLabel);
        frame.add(rollField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(collegeLabel);
        frame.add(collegeField);
        frame.add(classLabel);
        frame.add(classField);
        frame.add(genderLabel);
        frame.add(genderField);
        frame.add(mobileLabel);
        frame.add(mobileField);
        frame.add(aadharLabel);
        frame.add(aadharField);
        frame.add(cityLabel);
        frame.add(cityField);
        frame.add(submitButton);
        frame.add(messageLabel);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Roll No: " + rollField.getText() +
                              ", Name: " + nameField.getText() +
                              ", College: " + collegeField.getText() +
                              ", Class: " + classField.getText() +
                              ", Gender: " + genderField.getText() +
                              ", Mobile: " + mobileField.getText() +
                              ", Aadhar: " + aadharField.getText() +
                              ", City: " + cityField.getText();
                messageLabel.setText("Registered: " + data);
            }
        });
    }
}
