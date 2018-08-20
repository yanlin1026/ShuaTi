package 排序;

import static Utils.Utils.display;
import static Utils.Utils.swap;


/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 20:21
 * Description:
 */
public class HeapSort {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 8, 4, 2, 6, 1};
        //建堆之后第一个元素必为改数组最大的元素
        heapSort(arr);
        display("heapSort：", arr);
    }

    public static void heapSort(int[] arr) {
        heapInsert(arr);
        display("建堆后：", arr);
        int size = arr.length;
        swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            display("下沉：", arr);
            swap(arr, 0, --size);
        }
    }

    /**
     * @param a heap其实就是完全二叉树，从左往右依次补齐
     *          可以将数组理解为完全二叉树
     *          建堆--大根堆每个节点都是最大的数
     *          时间复杂度为：O(N)
     */
    public static void heapInsert(int[] a) {
        for (int i = 0; i < a.length; i++) {
            while (a[i] > a[(i - 1) / 2]) {
                swap(a, i, (i - 1) / 2);
                i = (i - 1) / 2;
            }
        }
    }

    /**
     * @param arr：数组
     * @param index：数组下标
     * @param heapSize：堆大小 一个值变化，向下沉的过程
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left]
                    ? left + 1
                    : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }
}
