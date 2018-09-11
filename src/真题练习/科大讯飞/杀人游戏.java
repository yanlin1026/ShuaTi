package 真题练习.科大讯飞;

import java.util.ArrayList;
import java.util.Scanner;

import static Utils.Utils.display;

/**
 * @auther: yanlin
 * @date: 2018/9/7 17:25
 * @description:
 */
public class 杀人游戏 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(in.nextInt());
        }
        display(arrayList);
        System.out.println(fun(arrayList));
        fun(arrayList);
        
    }
    
    
    

    private static int fun(ArrayList<Integer> arr) {
        int count = 0;
        if (arr.size() == 0) {
            return 0;
        }
        while (arr.size() != 1) {
            for (int i = arr.size() - 1; i > 0; i--) {
                if (arr.get(i - 1) > arr.get(i)) {
                    arr.remove(arr.get(i));
                }
            }
            count++;
        }
        return count;
    }
}
