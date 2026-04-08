package Questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pra23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        JTextField text = new JTextField();
        text.setBounds(50, 50, 250, 30);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        add.setBounds(50, 100, 50, 50);
        sub.setBounds(120, 100, 50, 50);
        mul.setBounds(190, 100, 50, 50);
        div.setBounds(260, 100, 50, 50);

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        num1Field.setBounds(50, 170, 120, 30);
        num2Field.setBounds(180, 170, 120, 30);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 220, 250, 30);

        frame.add(text);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(resultLabel);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            resultLabel.setText("Result: " + (num1 + num2));
        });

        sub.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            resultLabel.setText("Result: " + (num1 - num2));
        });

        mul.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            resultLabel.setText("Result: " + (num1 * num2));
        });

        div.addActionListener(e -> {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            if(num2 != 0)
                resultLabel.setText("Result: " + (num1 / num2));
            else
                resultLabel.setText("Error: Division by zero");
        });
    }
}
