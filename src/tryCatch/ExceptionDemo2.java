package tryCatch;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound exception");
        }
        System.out.println("下面的也会被执行而不是直接退出程序！");
    }
}
