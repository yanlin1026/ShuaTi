package 真题练习.头条;

import java.util.Scanner;

import static Utils.Utils.display;

/**
 * @auther: yanlin
 * @date: 2018/9/9 10:19
 * @description:
 */
public class 合并部门 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] team = new int[m][m];
        for(int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                team[i][j] = in.nextInt();
            }
        }
        int[] dp = new int[m];
        display(team);
        for(int i = 0;i<m-1;i++) {
            for (int j = 0; j < m-1; j++) {

            }
        }
    }

}
