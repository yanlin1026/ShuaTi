package 真题练习.滴滴;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/2 18:33
 * @description:
 */
public class 丑数 {
    public static boolean isUgly(int number){
        while(number % 2 == 0) {
            number/=2;
        }
        while(number % 3 == 0) {
            number /=3;
        }
        while(number % 5 == 0) {
            number /=5;
        }
        return (number ==1)? true:false;
    }
    public static int getUglyNumber(int index){
        if(index <= 0) {
            return 0;
        }
        int number = 0;
        int uglyFound = 0;
        while(uglyFound < index){
            number++;
            if(isUgly(number)){
                ++uglyFound;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(getUglyNumber(n));
    }

}
