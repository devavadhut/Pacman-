package Questions;

import java.io.*;

public class pra20 {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a sample text.\nWelcome to Java file handling.");
            writer.close();

            // Read from file
            FileReader reader = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
