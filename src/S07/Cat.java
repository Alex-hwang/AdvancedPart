package S07;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void eat(String something) {
        System.out.println("猫在吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
