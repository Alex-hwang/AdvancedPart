* ```Object```类是Java中的顶级父类，所有类都直接或间接继承自Object类。
* ```Object```类中的方法可以被所有子类访问，所以我们要学习Object类中的方法。


* ```object```的构造方法：空参构造

```java
public Object() {
}
```

* ```object```的方法：

```java
public String toString() //返回对象的字符串表达形式

public boolean equals(Object obj) //判断两个对象是否相等

public Object clone(int a) //克隆对象
```

* 说明

```java
Object obj = new Object();
String s = obj.toString(); //返回对象的字符串表达形式
System.out.

println(s); //java.lang.Object@1540e19d 这是地址值
```

*当我们打印一个对象的时候，底层会把对象变成字符串的形式然后输出在控制台。

* 对象克隆
  把对象的属性值完全拷贝给另一个对象，也叫对象拷贝对象复制
* ```clone```方法的作用是克隆对象，但是我们需要实现```Cloneable```接口，这个接口是一个标记接口，没有任何方法。

```java
public static void main(String[] args) {
  Person p1 = new Person();
  p1.name = "张三";
  p1.age = 23;
  Person p2 = (Person) p1.clone();
  System.out.println(p2.name);
  System.out.println(p2.age);
}
```

* 深克隆&浅克隆
  * 深克隆：克隆对象的所有属性值，包括引用类型的属性值。
  * 浅克隆：只克隆对象的基本数据类型的属性值，引用类型的属性值不会被克隆，还是指向原来的对象。


* ```equals```方法

```java
public static void main(String[] args) {
  Person p1 = new Person();
  p1.name = "张三";
  p1.age = 23;
  Person p2 = new Person();
  p2.name = "张三";
  p2.age = 23;
  System.out.println(p1.equals(p2)); //false
}
```

* ```equals```方法默认比较的是两个对象的**地址值**，我们可以重写```equals```方法，比较两个对象的属性值。

```java

@Override
public boolean equals(Object obj) {
  if (this == obj) {
    return true;
  }
  if (obj == null || getClass() != obj.getClass()) {
    return false;
  }
  Person person = (Person) obj;
  return age == person.age && Objects.equals(name, person.name);
}
```

```Objects```是一个工具类，提供了一些方法来完成一些功能

```java
import java.util.Objects;

public static boolean equals(Object a, Object b) {
    return Objects.equals(a, b);
}//比较两个对象是否相等
public static boolean isNull(Object obj) {
    return obj == null;
}//判断对象是否为空
public static boolean nonNull(Object obj) {
    return obj != null;
}//判断对象是否不为空
```
