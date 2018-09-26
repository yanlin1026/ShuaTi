package 真题练习.爱奇艺;

import java.util.ArrayList;
import java.util.Scanner;

import static Utils.Utils.display;

/**
 * @auther: yanlin
 * @date: 2018/9/15 10:45
 * @description:
 */
public class 局长的事物 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//n种食物
        int m = in.nextInt();//m天
        int p = in.nextInt();//p种食物的份数排名
        System.out.println(m);
        int[] foods = new int[n];
        for (int i = 0; i < n; i++) {
            foods[i] = in.nextInt();
        }
        display(foods);
        for (int i = 0; i <= m; i++) {
            String[] strings = in.nextLine().split(" ");
            switch (strings[0]){
                case "B": foods[Integer.parseInt(strings[1])-1] -= 1;break;
                case "A": foods[Integer.parseInt(strings[1])-1] += 1;break;
            }
        }

        int count = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0;i<foods.length;i++){
            int food = foods[p-1];
            if(foods[i]>=food){

                count++;
            }
        }

        System.out.println(count);
    }
}
