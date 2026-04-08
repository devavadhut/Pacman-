package Questions;

import javax.swing.*;
import java.awt.event.*;

public class pra30 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Popup Menu Example");
        JPopupMenu popup = new JPopupMenu();

        JMenuItem item1 = new JMenuItem("Option 1");
        JMenuItem item2 = new JMenuItem("Option 2");
        JMenuItem item3 = new JMenuItem("Option 3");

        popup.add(item1);
        popup.add(item2);
        popup.add(item3);

        JLabel label = new JLabel("Right-click anywhere to see popup menu");
        label.setBounds(20, 50, 300, 30);

        frame.add(label);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        item1.addActionListener(e -> JOptionPane.showMessageDialog(frame, "You selected Option 1"));
        item2.addActionListener(e -> JOptionPane.showMessageDialog(frame, "You selected Option 2"));
        item3.addActionListener(e -> JOptionPane.showMessageDialog(frame, "You selected Option 3"));
    }
}
