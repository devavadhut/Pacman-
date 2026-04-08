import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Pac-Man Game");

        PacMan game = new PacMan();

        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        game.requestFocus();
    }
}