package Questions;

import javax.swing.*;
import java.awt.event.*;

public class pra29 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Window");

        JLabel label = new JLabel("Click the button:");
        label.setBounds(50, 50, 150, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 100, 30);

        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(50, 150, 200, 30);

        frame.add(label);
        frame.add(button);
        frame.add(messageLabel);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Button Clicked!");
            }
        });
    }
}
