package Questions;

import java.io.*;

public class pra21 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("destination.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
