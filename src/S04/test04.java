package S04;

public class test04 {
    public static void main(String[] args) {
        Ragdoll r = new Ragdoll();
        r.eat();
        r.sleep();
        r.catchMouse();

        Lihua l = new Lihua();
        l.catchMouse();
        l.eat();
        l.sleep();

        Husky h = new Husky();
        h.eat();
        h.sleep();
        h.bark();
        h.breakHome();

        Tidy t = new Tidy();
        t.eat();
        t.sleep();
        t.bark();
        t.touch();
    }

}
