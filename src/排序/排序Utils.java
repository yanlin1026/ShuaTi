package 排序;

/**
 * @author yanlin
 * @date 2018/8/17 下午4:51
 */
public class 排序Utils {

    /**
     * 打印数组
     * @param a
     */
    public static void display(int[] a) {

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                }
            }
        }
        display(a);
    }

    /**
     * 每次遍历找到一个最小的数的的下标
     * 初始假设第一个数是最小的
     *
     * @param a
     */
    public static void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
        }
        display(a);
    }

    /**
     * 每i次遍历前i个元素已经排好
     * 假定第1个元素已经排好
     * 从第二个开始遍历，加入第二个比第1个大,则交换
     *
     * @param a
     */
    public static void insertSort(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
        display(a);
    }

    /**
     * 将大于第一个数的全部放右边，小于第一个数的全部放左边
     * 荷兰国旗问题，快排思想
     * @param a
     */
    public static void 荷兰国旗问题(int[] a) {
        int num = a[0];
        int i = 0;
        int less = -1;
        int more = a.length;
        while (i < more) {
            if (a[i] < num) {
                swap(a, ++less, i++);
            } else if (a[i] > num) {
                swap(a, i, --more);
            } else {
                i++;
            }
        }
        display(a);
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left > right)
            return;

        int i = left;
        int j = right;
        int tmp = a[left];
        while (i != j) {
            while (a[j] >= tmp && i < j) {
                j--;
            }
            while (a[i] <= tmp && i < j) {
                i++;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        //基数tmp归位
        a[left] = a[i];
        a[i] = tmp;
        quickSort(a, left, i - 1);
        quickSort(a, i + 1, right);

    }

    public static void mergeSort(int[] a, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public static void merge(int[] a, int left, int middle, int right) {
        //辅助队列
        int[] help = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = middle + 1;
        while (p1 <= middle && p2 <= right) {
            help[i++] = a[p1] < a[p2] ? a[p1++] : a[p2++];
        }
        //上面循环结束的时，p1=middle或p2=right
        while (p2 <= right) {//p1 = middle
            help[i++] = a[p2++];
        }
        while (p1 <= middle) {//p2 = right
            help[i++] = a[p1++];
        }

        //将辅助的数组赋值给原数组
        for (i = 0; i < help.length; i++) {
            a[left + i] = help[i];
        }
    }
}
