package 真题练习.美团;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/3 20:01
 * @description: 完全背包问题
 */
public class 换钱 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] money = {1, 5, 10, 20, 50, 100};
        fun(money, n);
    }

    private static void fun(int[] money, int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1l;
        for (int i = 0; i < money.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= money[i]) {
                    dp[j] = dp[j] + dp[j - money[i]];
                }
            }
        }
        System.out.println(dp[n]);

    }
}
