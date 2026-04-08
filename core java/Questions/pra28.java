package Questions;

import java.sql.*;

public class pra28 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Roll No\tName\tAge\tClass\tCity");
            while(rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String cls = rs.getString("class");
                String city = rs.getString("city");

                System.out.println(roll + "\t" + name + "\t" + age + "\t" + cls + "\t" + city);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
