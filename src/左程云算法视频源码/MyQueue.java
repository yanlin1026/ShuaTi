package 左程云算法视频源码;

/**
 * @auther: yanlin
 * @date: 2018/9/23 16:30
 * @description:
 */
public class MyQueue {
	public int[] arr;
	int size;
	int head;// 要返回值的索引
	int end;// 插入值的索引

	public MyQueue(int initSize) {
		arr = new int[initSize];
		size = 0;
		head = 0;
		end = 0;
	}

	public void insert(int value) {
		if (size > arr.length) {
			System.out.println("full");
		}
		arr[end++] = value;
		size++;
	}
	public int remove(){
		size--;
		return arr[head++];
	}
}
