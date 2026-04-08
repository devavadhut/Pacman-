package Questions;

import java.awt.*;
import java.awt.event.*;

public class pra22 {
    public static void main(String[] args) {
        Frame f = new Frame("Basic Form");
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label ageLabel = new Label("Age:");
        TextField ageField = new TextField();
        Button submit = new Button("Submit");

        nameLabel.setBounds(50, 50, 80, 30);
        nameField.setBounds(150, 50, 150, 30);
        ageLabel.setBounds(50, 100, 80, 30);
        ageField.setBounds(150, 100, 150, 30);
        submit.setBounds(150, 150, 80, 30);

        f.add(nameLabel);
        f.add(nameField);
        f.add(ageLabel);
        f.add(ageField);
        f.add(submit);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Name: " + nameField.getText());
                System.out.println("Age: " + ageField.getText());
            }
        });
    }
}
