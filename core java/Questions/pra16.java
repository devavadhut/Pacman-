package Questions;

interface Animal1 {
    void sound();
}

class Dog1 implements Animal1 {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class pra16 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.sound();
    }
}
 