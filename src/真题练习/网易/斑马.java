package 真题练习.网易;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/8 16:35
 * @description:
 */
public class 斑马 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.println(fun(string));
    }

    private static int fun(String S) {
        if (S == null) {
            return 0;
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != 'b' || S.charAt(i) != 'w')
                return 0;
        }

        int l = S.length();
        int[] numA = new int[l + 1];
        int[] numB = new int[l + 1];
        int a = 0, b = 0;

        for (int i = 0; i < l; i++) {
            if (S.charAt(i) == 'A')
                a++;
            if (S.charAt(i) == 'B')
                b++;
            numA[i + 1] = a;//表示数到第i个A的个数为a，即截止到当前位置的子串A个数为a
            numB[i + 1] = b;//表示数到第i个B的个数为b，即截止到当前位置的子串B个数为b
        }

        if (a == 0 || b == 0) return 0;
        int res = a > b ? a : b;
        for (res *= 2; res > 0; res -= 2) {
            for (int i = res; i < l + 1; i++) {
                if (numA[i] - numA[i - res] == numB[i] - numB[i - res]) {
                    return res;
                }
            }
        }
        return 0;
    }
}
