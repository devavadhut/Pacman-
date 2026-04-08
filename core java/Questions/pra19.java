package Questions;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class pra19 {
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be at least 18");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
