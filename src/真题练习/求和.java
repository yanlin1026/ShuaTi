package 真题练习;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 16:54
 * Description:输入两个整数 n 和 m，
 * 从数列1，2，3.......n 中随意取几个数,
 * 使其和等于 m ,要求将其中所有的可能组合列出来
 */
public class 求和 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int up = n > m ? m : n;
        printList(m, up, list);
    }
    public static void printList(int m, int n, List<Integer> list) {
        if (m == 0) {
            System.out.println(list);
            return;
        }
        if (n <= 0 || m < 0) {
            return;
        }
        List list1 = new ArrayList<>(list);
        printList(m, n - 1, list);
        list1.add(n);
        printList(m - n, n - 1, list1);

    }
}
