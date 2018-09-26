package 真题练习.小红书;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/18 18:59
 * @description:
 */
public class Main1 {
    public static String fun(String string) {
        if (string == null || string.length() == 0) {
            return " ";
        }
        StringBuilder sb = new StringBuilder();
        char p = string.charAt(0);
        int count = 1;
        for (int i = 1; i < string.length(); i++) {
            if (p == string.charAt(i)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(p);
                } else {
                    sb.append(count - 1 + "" + p);
                }
                p = string.charAt(i);
                count = 1;
            }
        }
        if (count == 1) {
            sb.append(p);
        } else {
            sb.append(count - 1 + "" + p);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String nextLine = scr.nextLine();
        System.out.println(fun(nextLine));
    }
}
