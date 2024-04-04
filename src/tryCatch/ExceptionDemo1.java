package tryCatch;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception");
        }
        System.out.println("即使代码是正确的，但是下面的也会被执行而不是直接退出程序！");
        System.out.println("下面的也会被执行而不是直接退出程序！");
    }
}
