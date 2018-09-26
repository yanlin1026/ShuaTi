package 真题练习.小红书;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/18 19:00
 * @description:
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums = fun(n);
        System.out.println(nums);
    }

    public static int fun(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }
        return count;
    }
}