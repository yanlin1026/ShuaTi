package 左程云算法视频源码;

import java.util.Stack;

/**
 * @auther: yanlin
 * @date: 2018/9/25 14:57
 * @description:
 */
public class Stack2Queue {
	static Stack<Integer> data = new Stack<>();
	static Stack<Integer> help = new Stack<>();

	public static void push(int value) {
		data.push(value);
	}

	public static int pop() {

		if (help.isEmpty()) {
			while (!data.isEmpty()) {
				help.push(data.pop());
			}
		}
		return help.pop();
	}
}
