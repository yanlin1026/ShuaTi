package 真题练习.头条;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/9 11:31
 * @description:
 */

public class 部门 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int[][] rect = new int[M][M];
        for (int i = 0; i < rect.length; i++) {
            for (int j = 0; j < rect[i].length; j++) {
                rect[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < rect.length-1; i++) {
            for (int j = 0; j < rect[i].length-1; j++) {
                if (rect[i][j] == 1) {
                    fun(rect, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    private static void fun(int[][] rect, int i, int j) {
        rect[i][j] = 4;
        if (i < rect.length - 1 && rect[i + 1][j] == 1) {
            fun(rect, i + 1, j);
        }
        if (i > 0 && rect[i - 1][j] == 1) {
            fun(rect, i - 1, j);
        }
        if (j < rect[i].length - 1 && rect[i][j + 1] == 1) {
            fun(rect, i, j + 1);
        }
        if (j > 0 && rect[i][j - 1] == 1) {
            fun(rect, i, j - 1);
        }
    }

}