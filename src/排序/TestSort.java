package 排序;

import static 排序.SortUtil.*;


/**
 * @author yanlin
 * @date 2018/8/17 下午4:57
 */
public class TestSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 8, 4, 2, 6, 1};
        display("数组a为:",a);
        insertSort(a);
        display("insertSort:",a);
    }
}
