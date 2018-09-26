package 真题练习.头条;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/20 19:28
 * @description:
 */
public class 幸运数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int count = 0;
		for (int i = a; i <= b; i++) {
			if(fun(i)){
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean fun(int num) {

		String string = String.valueOf(num);
		char[] c = new char[string.length()];
		for (int j = 0; j < string.length(); j++) {
			c[j] = string.charAt(j);
		}
		for (int i = 0;i<=(c.length/2-1);i++){
			if(c[i]==c[c.length-1-i]){
				return false;
			}
		}
		System.out.println(num);
		return true;

	}
}
