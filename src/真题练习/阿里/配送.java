package 真题练习.阿里;

import java.util.*;

/**
 * @auther: yanlin
 * @date: 2018/9/7 19:55
 * @description:
 */
public class 配送 {

    public static int fun(double d) {
        int b = (int) d;
        if (d - 0.5 >= b) {
            b++;
            return b;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String xy = in.nextLine();
        String[] split = xy.split(",");
        Double max = Math.max(Double.parseDouble(split[0]), Double.parseDouble(split[1]));

        String string = in.nextLine();

        String[] strings = string.split(",");
        double[] a = new double[strings.length];
        for (int i = 0; i < strings.length; i++) {
            a[i] = Double.parseDouble(strings[i]);
        }
        Arrays.sort(a);
        if (a[strings.length - 1] >= max) {
            System.out.println("yes" + 0);
        } else {
            double l = max - a[strings.length - 1];
            int d = fun(l);
            System.out.println("no," + d);
        }
    }
}
