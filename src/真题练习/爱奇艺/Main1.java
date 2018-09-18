package 真题练习.爱奇艺;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/15 11:44
 * @description:
 */
public class Main1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(getMin(str));
    }

    private static int getMin(String str) {
        if (str == null || str.length() != 6) {
            return 0;
        }
        int[] a = new int[str.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int sum1 = a[0] + a[1] + a[2];
        int sum2 = a[3] + a[4] + a[5];
        int count = 0;
        if (sum1 == sum2) {
            return 0;
        } else if (sum1 > sum2) {
            while (sum1 > sum2) {
                int charValues = sum1 - sum2;
                int min = a[3];
                for (int i = 4; i < 6; i++) {
                    if (min > a[i]) {
                        int temp = min;
                        min = a[i];
                        a[3] = a[i];
                        a[i] = temp;
                    }
                }
                if (charValues < 9 - min || charValues == 9 - min) {
                    count++;
                    sum1 = sum2;
                } else {
                    sum2 = sum2 + 9 - min;
                    a[3] = 9;
                    count++;
                }
            }
        } else {
            while (sum2 > sum1) {
                int cha = sum2 - sum1;
                int min = a[0];
                for (int i = 1; i < 3; i++) {
                    if (min > a[i]) {
                        int temp = min;
                        min = a[i];
                        a[i] = temp;
                        a[0] = a[i];
                    }
                }
                if (cha < 9 - min || cha == 9 - min) {
                    count++;
                    sum2 = sum1;
                } else {
                    sum1 = sum1 + 9 - min;
                    a[0] = 9;
                    count++;
                }
            }
        }
        return count;
    }
}