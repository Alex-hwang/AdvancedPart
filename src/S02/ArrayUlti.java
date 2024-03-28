package S02;

public class ArrayUlti {

    //私有化构造方法
	//目的：不让外界创建它的对象

	private ArrayUlti(){}

	//需要定义为静态的，方便使用
	public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++)
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

}
