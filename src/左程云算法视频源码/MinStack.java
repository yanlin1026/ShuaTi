package 左程云算法视频源码;

import java.util.Stack;

/**
 * @auther: yanlin
 * @date: 2018/9/25 14:41
 * @description:
 */
public class MinStack {

	Stack<Integer> data = new Stack<>();
	Stack<Integer> min = new Stack<>();

	public void push(int value) {
		if (min.isEmpty()) {
			min.push(value);
		} else if (min.peek() > value) {
			min.push(value);
		} else {
			min.push(min.peek());
		}
		data.push(value);
	}

	public int pop() {
		min.pop();
		return data.pop();
	}

	public int getMin() {
		return min.peek();
	}

	public static void main(String[] args) {

	}
}
