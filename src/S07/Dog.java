package S07;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void eat(String something) {
        System.out.println("狗在吃" + something);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
