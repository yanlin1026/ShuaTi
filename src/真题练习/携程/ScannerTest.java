package 真题练习.携程;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/4 20:38
 * @description:
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);
        ArrayList<String> arrayList = new ArrayList<>(a);
        System.out.println(arrayList.size());
        for (int i = 0;i<a;i++){
            while(in.hasNext()){
                String str = in.nextLine();
                arrayList.add(str);
            }
        }
        System.out.println(arrayList.get(0));
    }
}
