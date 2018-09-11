package 真题练习.携程;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/4 19:32
 * @description:
 */
public class 二进制中1的个数 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(fun(n));
    }

    public static int fun(long n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);//每次都消除该数中最右边的1
        }
        return count;
    }

}
