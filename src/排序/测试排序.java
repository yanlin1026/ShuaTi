package 排序;

import static 排序.排序Utils.*;


/**
 * @author yanlin
 * @date 2018/8/17 下午4:57
 */
public class 测试排序 {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 8, 4, 2, 6, 1};
        display(a);
        mergeSort(a, 0, a.length-1);
        display(a);
    }
}
