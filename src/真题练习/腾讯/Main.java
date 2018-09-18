package 真题练习.腾讯;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/16 11:01
 * @description:
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(testLCM(n, 6));
//        for (int m = n + 1; ; m++) {
//            int[] a = new int[m - n];
//            for (int i = 0; i < m - n; i++) {
//                a[i] = n + i + 1;
//            }
//            if (fun3(a) == testLCM(m)) {
//                System.out.println(m);
//                break;
//            }
//
//        }

    }

    public static int fun1(int n, int m) {
        while (n % m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        return m;

    }

    public static int fun2(int n, int m) {
        return n * m / fun1(n, m);

    }

    public static int fun3(int[] a) {// 求多个数的最小公倍数
        int value = a[0];
        for (int i = 1; i < a.length; i++) {
            value = fun2(value, a[i]);
        }
        return value;

    }

    public static int testLCM(int n,int m) {
        int result = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            while (m > 0) {
                int count = 0;
                for (int j = n; j <= m; j++) {
                    if (i % j != 0) {
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == m) {
                    result = i;
                    break;
                }
                m--;
            }
            if (result > 0) {
                break;
            }
        }
        return m;
    }
}