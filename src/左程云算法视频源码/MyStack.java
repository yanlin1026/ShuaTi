package 左程云算法视频源码;

/**
 * @auther: yanlin
 * @date: 2018/9/23 15:17
 * @description:
 */
public class MyStack {
	int[] arr;
	int index;
	public MyStack(int initSize){
		arr = new int[initSize];
		index = 0;
	}
	public void push(int obj){
		if (index>arr.length) {
			System.out.println("stack is full");
		} 
		arr[index++] = obj;
	}
	public int pop(){
		if (index==0) {
			return -1;
		} 
		return arr[--index];
	}


}
