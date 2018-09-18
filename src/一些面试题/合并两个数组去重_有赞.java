package 一些面试题;

import java.util.ArrayList;

/**
 * @auther: yanlin
 * @date: 2018/9/16 16:43
 * @description: 归并排序的思想，借助一个队列
 */
public class 合并两个数组去重_有赞 {
    public static void main(String[] args) {
        int[] a = {12, 32, 63, 84, 105};
        int[] b = {12, 32, 53, 74, 95};
        ArrayList<Integer> queue = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                queue.add(a[i++]);
            } else if (a[i] == b[j]) {
                queue.add(a[i]);
                i++;
                j++;
            } else {
                queue.add(b[j++]);
            }
        }
        System.out.println(queue);
    }
}
