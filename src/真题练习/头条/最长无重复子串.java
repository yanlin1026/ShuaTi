package 真题练习.头条;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/9 10:04
 * @description:
 */
public class 最长无重复子串 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(fun(string));
    }
    public static int fun(String string) {

        Map<Character, Integer> charIntegerMap = new HashMap<Character, Integer>();

        int[] dp = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            Integer last = charIntegerMap.get(string.charAt(i));
            if (last == null) {
                dp[i] = i == 0 ? 1 : dp[i - 1] + 1;
                charIntegerMap.put(string.charAt(i), i);
            } else {
                int a = last + 1;
                int len = dp[i - 1];
                int b = i - len;
                if (a >= b) {
                    dp[i] = i - a + 1;
                } else {
                    dp[i] = i - b + 1;
                }
                charIntegerMap.put(string.charAt(i), i);
            }
        }
        int max = dp[0];
        for (int i : dp)
            if (i > max) max = i;
        return max;
    }
}
