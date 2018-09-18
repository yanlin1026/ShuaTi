package 一些面试题;

/**
 * @auther: yanlin
 * @date: 2018/9/14 21:54
 * @description: 先翻转右侧的字符串，
 *               再翻转左侧的字符串，然后右侧拼接左侧
 */
public class 字符串翻转_京东 {
    public static void main(String[] args) {
        String string = "abcd";
        System.out.println(stringReverse(string));
    }

    private static String stringReverse(String string) {
        int length = string.length();
        if (length <= 1) {
            System.out.println(string);
            return string;
        }
        return stringReverse(string.substring(length / 2 , length))+stringReverse(string.substring(0, length / 2));
    }
}
