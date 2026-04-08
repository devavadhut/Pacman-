package Questions;

class Student {
   
    int rollNo;
    String name;

     
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

 
public class pra12 {
    public static void main(String[] args) {

        
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Avadhut";

         
        Student s2 = new Student();
        s2.rollNo = 102;
        s2.name = "Siddhesh";

         
        s1.display();
        s2.display();
    }
}
