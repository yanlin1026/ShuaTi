package 真题练习;

import java.util.Scanner;

import static Utils.Utils.display;

/**
 * @auther: yanlin
 * @date: 2018/9/9 19:55
 * @description:
 */
public class 物品 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[][] goods=new int[n][3];
        for (int i = 0; i < n; i++) {
            String string=in.nextLine();
            String[] strings = string.split(" ");
            goods[i][0]=Integer.valueOf(strings[0]);
            goods[i][1]=Integer.valueOf(strings[1]);
            goods[i][2]=Integer.valueOf(strings[2]);
        }
        display(goods);
        fun(goods);
    }

    private static void fun(int[][] goods) {
        int count=0;
        for (int i = 0; i < goods.length; i++) {
            for (int j = 0; j < goods.length; j++) {
                if (i!=j&&goods[i][0]<goods[j][0]&&goods[i][1]<goods[j][1]&&goods[i][2]<goods[j][2]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }


}

