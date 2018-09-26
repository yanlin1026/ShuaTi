package 左程云算法视频源码;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther: yanlin
 * @date: 2018/9/25 14:59
 * @description:
 */
public class Queue2Stack {

	static Queue<Integer> data = new LinkedList<>();
	static Queue<Integer> help = new LinkedList<>();

	public static void push(int value) {
		data.add(value);
	}

	public static int pop() {
		if (help.isEmpty()) {
			while (data.size() > 1) {
				help.add(data.poll());
			}
		}
		int result = data.poll();
		swap();
		return result;
	}

	private static void swap() {
		Queue<Integer> tmp = help;
		help = data;
		data = tmp;
	}

}
