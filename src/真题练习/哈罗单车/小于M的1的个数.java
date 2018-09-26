package 真题练习.哈罗单车;

/**
 * @auther: yanlin
 * @date: 2018/9/25 21:30
 * @description:
 */
public class 小于M的1的个数 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 99; i++) {
			count += fun(i);
		}
		System.out.println(count);
	}

	public static int fun(int n) {
		int count = 0;
		while (n != 0) {
			if (n % 10 == 1) {
				count++;
			}
			n = n / 10;
		}
		return count;
	}
}
