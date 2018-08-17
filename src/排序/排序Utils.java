package 排序;

/**
 * @author yanlin
 * @date 2018/8/17 下午4:51
 */
public class 排序Utils {

    public static void 打印数组(int[] a) {

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void 交换(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void 冒泡(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    交换(a, j, j - 1);
                }
            }
        }
        打印数组(a);
    }

    /**
     * 每次遍历找到一个最小的数的的下标
     * 初始假设第一个数是最小的
     *
     * @param a
     */
    public static void 选择(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            交换(a, i, minIndex);
        }
        打印数组(a);
    }

    /**
     * 每i次遍历前i个元素已经排好
     * 假定第1个元素已经排好
     * 从第二个开始遍历，加入第二个比第1个大,则交换
     *
     * @param a
     */
    public static void 插入(int[] a) {
        for (int i = 1; i <= a.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1]) {
                    交换(a, j, j + 1);
                }
            }
        }
        打印数组(a);
    }

    /**
     * 将大于第一个数的全部放右边，小于第一个数的全部放左边
     *
     * @param a
     */
    public static void 荷兰国旗问题(int[] a) {
        int num = a[0];
        int i = 0;
        int less = -1;
        int more = a.length;
        while (i < more) {
            if (a[i] < num) {
                交换(a, ++less, i++);
            } else if (a[i] > num) {
                交换(a, i, --more);
            } else {
                i++;
            }
        }
        打印数组(a);
    }
}
