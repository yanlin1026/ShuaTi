package 真题练习;

import static Utils.Utils.display;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 17:37
 * Description:
 */
public class 背包问题 {

    /**
     * 01背包问题
     *
     * @param weight：商品的重量
     * @param value：商品的价值
     * @param capacity：背包的容量
     */
    public static void packageBag(int[] weight, int[] value, int capacity) {
        int n = value.length;//商品的个数
        int[][] dp = new int[n + 1][capacity + 1]; //dp[i][j]表示前i个物品能装入容量为j的背包中的最大价值
        int[][] path = new int[n + 1][capacity + 1];
        //初始化第一列和第一行
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;// 如果容量j==0；意味着无法选择商品
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;// 如果商品个数为0，同样意味着无法选择商品
        }
        for (int i = 1; i < dp.length; i++) {// i表示商品的下表
            for (int j = 1; j < dp[0].length; j++) {//其实j表示背包的剩余重量
                if (weight[i - 1] > j)//如果i-1位置的重量大于背包的剩余容量j
                    dp[i][j] = dp[i - 1][j]; //因此，商品选择只能从前i-1中选取
                else { // j-weight[i-1]：表示选择j时之前剩余的容量
                    if (dp[i - 1][j] < dp[i - 1][j - weight[i - 1]] + value[i - 1]) {
                        dp[i][j] = dp[i - 1][j - weight[i - 1]] + value[i - 1];
                        path[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                    //dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]]+value[i-1]);
                }
            }
        }
        display("dp数组为：", dp);
        display("path数组为：", path);

        int i = dp.length - 1;
        int j = dp[0].length - 1;
        while (i > 0 && j > 0) {
            if (path[i][j] == 1) {
                System.out.print("第" + i + "个物品装入 ");
                j -= weight[i - 1];
            }
            i--;
        }
    }

    /**
     * 完全背包，商品可以多次选择
     * @param weight
     * @param value
     * @param capacity
     */
    public static void packageFullBag(int[] weight, int[] value, int capacity) {
        int n = value.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

            }
        }
    }

    public static void main(String[] args) {
        int[] weight = {3, 5, 2, 6, 4}; //物品重量
        int[] value = {4, 4, 3, 5, 3}; //物品价值

        packageBag(weight, value, 12);


    }

}
