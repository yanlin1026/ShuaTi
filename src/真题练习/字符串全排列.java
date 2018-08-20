package 真题练习;

/**
 * Created with IntelliJ IDEA.
 * User: yanlin
 * Date: 2018/8/19 23:13
 * Description:
 */
public class 字符串全排列 {



    public static char[] 字符交换(char[] a, int i, int j){

        char t = a[i];
        a[i] = a[j];
        a[j] = t;
        return a;
    }

    public static void 字符串全排列(char[] c, int from, int to){
        if(from == to){
            for(int i = 0;i <= to; i++){
                System.out.print(c[i]);
            }
            System.out.println();
        }
        for(int i = from; i <= to; i++){
            字符交换(c,i,from);
            字符串全排列(c,from+1,to);
            字符交换(c,i,from);
        }
    }

    public static void 字符串包含重复数字全排列(char[] c, int from, int to){
        if(from == to){
            for(int i = 0;i <= to; i++){
                System.out.print(c[i]);
            }
            System.out.println();
        }

        for(int i = from; i <= to; i++){

            boolean bool = true;
            for(int j = from; j < i; j++){
                if(c[i]==c[j]){
                    bool = false;
                    break;
                }
            }
            if(bool == false)
                continue;
            字符交换(c,i,from);
            字符串包含重复数字全排列(c,from+1,to);
            字符交换(c,i,from);
        }
    }
    public static void main(String[] args) {
        char[] c1 = {'1','2','3'};
        字符串全排列(c1, 0, c1.length-1);
        //字符串包含重复数字全排列(c1, 0, c1.length-1);

    }
}
