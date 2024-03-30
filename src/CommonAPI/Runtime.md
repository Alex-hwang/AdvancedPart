* 表示当前虚拟机的运行环境
* 该类提供了一些常用的方法，如获取当前线程、获取当前类、获取当前方法等
* 该类是一个抽象类，不能被实例化

* 该类的方法如下：

1. ```public static Runtime getRuntime()```：返回与当前Java应用程序相关的运行时对象
2. ```public void exit(int status)```：终止当前运行的Java虚拟机
3. ```public int availableProcessors()```：返回可用处理器的Java虚拟机的数量,即CPU的核心数
4. ```public long maxMemory()```：返回Java虚拟机试图使用的最大内存量,单位是字节
5. ```public long totalMemory()```：返回Java虚拟机中的内存总量,单位是字节
6. ```public long freeMemory()```：返回Java虚拟机中的空闲内存量,单位是字节
7. ```public Process exec(String command)```：在单独的进程中执行指定的字符串命令

```java
public class RuntimeDemo {
    public static void main(String[] args) {
        // 返回与当前Java应用程序相关的运行时对象
        Runtime runtime = Runtime.getRuntime();
        // 终止当前运行的Java虚拟机
        // 0表示正常退出
        // 非0表示异常退出
        runtime.exit(0);
        // 返回可用处理器的Java虚拟机的数量,即CPU的核心数
        int processors = runtime.availableProcessors();
        System.out.println(processors);
        // 返回Java虚拟机试图使用的最大内存量,单位是字节
        long maxMemory = runtime.maxMemory();
        System.out.println(maxMemory);
        // 返回Java虚拟机中的内存总量,单位是字节
        long totalMemory = runtime.totalMemory();
        System.out.println(totalMemory);
        // 返回Java虚拟机中的空闲内存量,单位是字节
        long freeMemory = runtime.freeMemory();
        System.out.println(freeMemory);
        // 在单独的进程中执行指定的字符串命令
        try {
            Process process = runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

* 补充：
  ```shutdown```:关机命令，需要参数

1. ```-s```：关机
2. ```-s -t```：延迟时间
3. ```-f```：强制关机
4. ```-r```：重启
5. ```-a```：取消关机
6. ```-l```：注销

* 恶搞关机代码

```java
public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("shutdown -s -t 300");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
