package Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 22:36
 * Description:
 */
public class Utils {
    /**
     * 打印数组
     *
     * @param a
     * @param description
     */
    public static void display(String description, int[] a) {
        System.out.print(description);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * 打印数组
     *
     * @param a
     */
    public static void display(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void display(ArrayList list) {
        for (Object i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * 交换
     *
     * @param a
     * @param i
     * @param j
     */
    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * 打印二维数组
     *
     * @param a
     */
    public static void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 打印二维数组
     *
     * @param description
     * @param a
     */
    public static void display(String description, int[][] a) {
        System.out.println(description + ":");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
