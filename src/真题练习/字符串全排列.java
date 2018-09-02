package 真题练习;

/**
 * Created with IntelliJ IDEA.
 * Date: 2018/8/19 23:13
 * Description:字符串09:23-23:50
 * @author yanlin
 */
public class 字符串全排列 {


    public static char[] 字符交换(char[] a, int i, int j) {

        char t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }

    /**
     * @param c
     * @param from
     * @param to
     * @description: 字符串09:23-23:50
     *
     */
    public static void 字符串全排列(char[] c, int from, int to) {
        if (from == to) {
            for (int i = 0; i <= to; i++) {
                System.out.print(c[i]);
            }
            System.out.println();
        }
        for (int i = from; i <= to; i++) {
            字符交换(c, i, from);//第一次,第一个数跟自己交换
            字符串全排列(c, from + 1, to);
            字符交换(c, i, from);
        }
    }

    /**
     * @param c
     * @param from
     * @param to
     * @description: 字符串24:00-
     */
    public static void 字符串包含重复数字全排列(char[] c, int from, int to) {
        if (from == to) {
            for (int i = 0; i <= to; i++) {
                System.out.print(c[i]);
            }
            System.out.println();
        }

        for (int i = from; i <= to; i++) {


            if (isSwap(c, from, i) == false){
                continue;
            }
            字符交换(c, i, from);
            字符串包含重复数字全排列(c, from + 1, to);
            字符交换(c, i, from);
        }
    }

    /**
     * @param c
     * @param from
     * @param to
     * @return
     *  判断，如果有重复字符，
     */
    public static boolean isSwap(char[] c, int from, int to) {
        boolean bool = true;
        for (int i = from; i < to; i++) {
            if (c[i] == c[to]) {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        char[] c1 = {'1', '2', '2', '3'};
        字符串全排列(c1, 0, c1.length - 1);
        //字符串包含重复数字全排列(c1, 0, c1.length-1);

    }
}
