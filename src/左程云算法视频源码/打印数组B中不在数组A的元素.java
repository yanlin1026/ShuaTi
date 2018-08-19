package 左程云算法视频源码;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 16:16
 * Description: 打印数组B中不在数组A的元素
 * 数组A与数组B均排好序
 */
public class 打印数组B中不在数组A的元素 {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6, 9, 11, 12};
        int[] b = {2, 3, 4, 5, 8, 10, 11};
        int i = 0;
        int j = 0;
        while (i <= a.length - 1) {
            while (j <= b.length - 1) {
                if (b[j] < a[i]) {
                    System.out.println(b[j]);
                    j++;
                } else if (b[j] == a[i]) {
                    j++;
                } else {
                    i++;
                }

            }
        }
    }
}
