package 真题练习.头条;

import org.junit.Test;

import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/20 19:59
 * @description:
 */
public class 前缀字符串 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] strings = new String[n];
		for (int i = 0; i < strings.length; i++) {
			strings[i] = in.nextLine();
		}
		int max=0;
		for (int i = 0; i < strings.length; i++) {
			for (int j = i+1; j < strings.length; j++) {
				max = fun(strings[j], strings[i]) > max ? fun(strings[j], strings[i]) : max;

			}
			System.out.println(strings[i].substring(0,max+1));
		}
	}

	public static int fun(String s1, String s2) {
		String str = "";
		int min = (s1.length() < s2.length()) ? s1.length() : s2.length();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int i;
		for (i = 0; i < min; i++) {

			if (ch1[i] == ch2[i]) {
				str = str + ch1[i];
			} else {
				break;
			}
		}
		return i;
	}

	@Test
	public void test() {
		System.out.println(fun("bytedance", "toutiaohao"));
	}

}
