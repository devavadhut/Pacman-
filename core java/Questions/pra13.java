package Questions;

class StudentInfo {
    int roll;
    String name;
    int age;

    StudentInfo() {
        roll = 0;
        name = "Unknown";
        age = 0;
    }

    StudentInfo(int r, String n) {
        roll = r;
        name = n;
        age = 18;
    }

    StudentInfo(int r, String n, int a) {
        roll = r;
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", Age: " + age);
    }
}

public class pra13 {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        StudentInfo s2 = new StudentInfo(101, "Avadhut");
        StudentInfo s3 = new StudentInfo(102, "Siddhesh", 20);

        s1.show();
        s2.show();
        s3.show();
    }
}
