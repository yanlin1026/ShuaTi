package 真题练习.头条;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/3 12:49
 * @description:
 * [6]=6*6=36;
 * [2]=2*2=4;
 * [1]=1*1=1;
 * [6,2]=2*8=16;
 * [2,1]=1*3=3;
 * [6,2,1]=1*9=9;
 */
public class 最大区间 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(getMax(arr, 0, n - 1));
    }

    private static int getMax(int[] arr, int start, int end) {
        if (arr == null || start > end) {
            return 0;
        }
        int n = end - start + 1;
        int[][] min = new int[n + 1][n + 1];
        int[] sum = new int[n + 1];
        sum[0] = 0;
        // sum[i]即从第一个数加到第i个数的和，也就是arr[0]+...+arr[i-1]
        for (int i = start + 1; i <= end + 1; i++) {
            sum[i - start] = sum[i - start - 1] + arr[i - start - 1];
        }

        int max = -1;
        for (int k = 0; k <= end - start; k++)
            // 左右下标的差，k==0时,区间内有1个数
            for (int i = 0; i <= end - start - k; i++) {
                int j = i + k;
                if (k == 0) {
                    min[i][j] = arr[i];
                } else {
                    if (arr[j] < min[i][j - 1]) {
                        min[i][j] = arr[j];
                    } else {
                        min[i][j] = min[i][j - 1];
                    }
                }
                max = Math.max(max, min[i][j] * (sum[j + 1] - sum[i]));
            }

        return max;
    }

}
