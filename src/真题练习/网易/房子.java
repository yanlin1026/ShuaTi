package 真题练习.网易;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/8 16:21
 * @description:
 */
public class 房子 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            String str = in.nextLine();
            String[] strings = str.split(" ");
            if (Integer.parseInt(strings[1])==0) {
                System.out.println(0 + " " + 0);
            }else if (Math.abs(Integer.parseInt(strings[1])-Integer.parseInt(strings[1]))==0){
                System.out.println(0+" "+0);
            }else if (Math.abs(Integer.parseInt(strings[1])-Integer.parseInt(strings[1]))>=2){
                System.out.println(0+""+(Integer.parseInt(strings[1])-Integer.parseInt(strings[1])));
            }

        }
    }
}
