package 真题练习.头条;

import java.util.Scanner;

import static Utils.Utils.display;


/**
 * @auther: yanlin
 * @date: 2018/9/9 20:46
 * @description:
 */
public class 图 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.nextLine());
            int m = Integer.parseInt(in.nextLine());
            int[][] ints = new int[m][2];
            for (int j = 0; j < m; j++) {
                if (ints[j][0]>n){
                    System.out.println("error");
                }
                String[] strings=in.nextLine().split(" ");
                ints[j][0]= Integer.parseInt(strings[0]);
                ints[j][1]= Integer.parseInt(strings[0]);
            }
            display(ints);
        }
    }
}
