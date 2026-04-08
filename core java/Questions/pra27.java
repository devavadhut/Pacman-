package Questions;

import java.sql.*;
import java.util.Scanner;

public class pra27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee No: ");
        int empno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        String empname = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","password");
            String sql = "INSERT INTO employees (empno, empname, salary, dept) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empno);
            ps.setString(2, empname);
            ps.setDouble(3, salary);
            ps.setString(4, dept);

            int rows = ps.executeUpdate();
            if(rows > 0)
                System.out.println("Employee details inserted successfully.");
            else
                System.out.println("Insertion failed.");

            ps.close();
            con.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
