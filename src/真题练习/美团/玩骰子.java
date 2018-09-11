package 真题练习.美团;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/3 19:49
 * @description: 即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。
 * 求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。
 */
public class 玩骰子 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fun(n));
    }

    public static int fun(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fun(n - 1) * 2;
        }
    }
}
