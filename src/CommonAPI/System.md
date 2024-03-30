* System也是一个工具类，提供了一些与系统相关的方法
* System类中的方法都是静态方法，可以直接通过类名调用

### System类的常用方法

* ```public static void exit(int status)```：终止当前运行的Java虚拟机
* ```public static long currentTimeMillis()```：返回以毫秒为单位的当前时间

    * 计算机中时间的原点是1970年1月1日0时0分0秒，这个时间叫做时间原点或者基准时间
        *
        原因是在1969年，贝尔实验室的程序员汤普森利用妻儿离开一个月的机会，开始着手创造一个全新的革命性的操作系统，这个操作系统就是Unix，而Unix的时间原点就是1970年1月1日0时0分0秒，这个时间被称为Unix时间戳，是C语言的生日

* ```public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)```：将数组中指定的数据拷贝到另一个数组中

```java
public class SystemDemo {
    public static void main(String[] args) {
        // 终止当前运行的Java虚拟机
        // 0表示正常退出
        // 非0表示异常退出
        System.exit(0);
        // 返回以毫秒为单位的当前时间
        long time = System.currentTimeMillis();
        System.out.println(time);
        // 将数组中指定的数据拷贝到另一个数组中
        int[] src = {1, 2, 3, 4, 5};
        int[] destination = {6, 7, 8, 9, 10};
        System.arraycopy(src, 0, destination, 0, 3);
        for (int j : destination) {
            System.out.println(j);
        }
    }
}
```
