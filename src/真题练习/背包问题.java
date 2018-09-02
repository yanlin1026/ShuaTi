package 真题练习;

import static Utils.Utils.display;
import static com.sun.glass.ui.gtk.GtkApplication.display;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 17:37
 * Description:
 */
public class 背包问题 {
    public static void main(String[] args) {
        int[] weight = {3, 5, 2, 6, 4}; //物品重量
        int[] val = {4, 4, 3, 5, 3}; //物品价值
        int m = 12; //背包容量
        int n = val.length; //物品个数

        int[][] dp = new int[n + 1][m + 1]; //dp[i][j]表示前i个物品能装入容量为j的背包中的最大价值
        int[][] path = new int[n + 1][m + 1];
        //初始化第一列和第一行
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        //通过公式迭代计算
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (weight[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    if (dp[i - 1][j] < dp[i - 1][j - weight[i - 1]] + val[i - 1]) {
                        dp[i][j] = dp[i - 1][j - weight[i - 1]] + val[i - 1];
                        path[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                    //dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]]+val[i-1]);
                    path[i][j] = 1;
                }
            }
        }
        display("dp数组为：", dp);
        display("dp数组为：", path);

        int i = dp.length - 1;
        int j = dp[0].length - 1;
        int value = 0;
        int wei = 0;
        while (i > 0 && j > 0) {
            if (path[i][j] == 1) {
                System.out.print("第" + i + "个物品装入 " + "价值：");
                value += val[i - 1];
                System.out.print(value + " 重量:");
                System.out.println(wei += weight[i - 1]);
                j -= weight[i - 1];

            }
            i--;
        }

    }

}
