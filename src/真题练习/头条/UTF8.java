package 真题练习.头条;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/9 11:07
 * @description:
 */
public class UTF8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] strings = new int[n];
        ArrayList<Byte> arrayList = new ArrayList<>();
        for(int i = 0;i<strings.length;i++){
            strings[i] = in.nextInt();

            arrayList.add(Byte.parseByte(String.valueOf(strings[i])));
        }

    }

}
