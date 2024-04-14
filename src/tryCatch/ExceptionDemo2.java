package tryCatch;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
            System.out.println(2 / 0);
            String s = null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (Exception e) {
            System.out.println("Parent exception");
        }
        System.out.println("下面的也会被执行而不是直接退出程序！");
        System.out.println("如果出现不止一个异常，只有第一个异常会被捕获，后面的异常会被忽略！");
        System.out.println("如果catch存在多个异常，子类异常必须写在父类异常的前面，否则会报错！");
        System.out.println("如果try中的异常没有被捕获，虚拟机会按照默认的情况进行，即直接退出程序！");

    }
}
