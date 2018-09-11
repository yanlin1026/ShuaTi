package 真题练习.携程;

/**
 * @auther: yanlin
 * @date: 2018/9/4 20:22
 * @description:
 */

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timeA = in.nextInt();
        String string = in.next();
        List<Integer> list = new ArrayList<>();

        for (int  i = 0;i < timeA;i++) {
            int old = in.nextInt();
            String start = in.next();
            String end = in.next();
            if (string.compareTo(start) >= 0 && end.compareTo(string) >= 0) {
                list.add(old);
            }
        }
        if (list.size() == 0) {
            System.out.println(null + "");
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

