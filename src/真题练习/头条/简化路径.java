package 真题练习.头条;

import java.util.Scanner;
import java.util.Stack;

/**
 * @auther: yanlin
 * @date: 2018/9/20 19:52
 * @description:
 */
public class 简化路径 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String path = in.nextLine();
		System.out.println(fun(path));
	}

	public static String fun(String path) {
		String[] strings = path.split("/");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < strings.length; ++i) {
			if (".".equals(strings[i]) || "".equals(strings[i]))
				continue;
			if ("..".equals(strings[i])) {
				if (!stack.empty())
					stack.pop();
			} else
				stack.push(strings[i]);
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.empty()) {
			sb.insert(0, stack.pop());
			sb.insert(0, "/");
		}
		if (sb.length() == 0)
			sb.append("/");
		return sb.toString();
	}

}
