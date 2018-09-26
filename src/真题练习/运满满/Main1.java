package 真题练习.运满满;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/19 21:52
 * @description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 21;

        char[] chars = new char[120];

        String string = in.nextLine();

        int len = string.length();

        for (int i = 0; i < len; i++) {
            int x = string.charAt(i);
            chars[x]++;
        }

        for (int i = 0; i < len; i++) {
            int x = string.charAt(i);
            if (chars[x] < max) {
                max = chars[x];
            }
        }

        for (int i = 0; i < len; i++) {
            int x = string.charAt(i);
            if (chars[x] != max) {
                System.out.print(string.charAt(i));
            }
        }
    }
}

