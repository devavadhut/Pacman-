 
import java.sql.*;
 

 
public class DBconnection {

    public static void main(String[] args) {
        
        

        try {
        	String url = "jdbc:mysql://localhost:3306/avadhutdb";
            String user = "root";
            String password = "rushikesh";
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL successfully!");
 
 
            con.close();

        } catch (Exception e) {
            e.printStackTrace();  // better debugging
        }
        
    }
}