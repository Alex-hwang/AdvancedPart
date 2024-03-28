package S06;

public class test01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(18);
        s.setName("张三");
        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("李四");
        Administrator a = new Administrator();
        a.setAge(40);
        a.setName("王五");

        register(s);
        register(t);
        register(a);

    }

    //这个方法既能结构老师又能接收学生还能接受管理员
    //把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
