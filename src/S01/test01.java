package S01;

public class test01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(20);
        s1.setGender("女");
        Student.teacher = "Mr. Li";


        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("Mary");
        s2.setAge(24);
        s2.setGender("男");

        s2.study();
        s2.show();
    }
}
