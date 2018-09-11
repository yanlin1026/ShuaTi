package 真题练习.携程;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/4 20:08
 * @description:
 */


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        Function lru = new Function(capacity);
        while (in.hasNext()) {
            String str = in.nextLine();
            String[] strArray = str.split(" ");
            if (strArray[0].equals('p' + "")) {
                int key = Integer.parseInt(strArray[1]);
                int value = Integer.parseInt(strArray[2]);
                lru.put(key, value);
            } else {
                int key = Integer.parseInt(strArray[1]);
                int result = lru.get(key);
                System.out.println(result);
            }

        }
    }

    public static class Function {
        private int capacity;
        private LinkedList<Integer> list;
        private HashMap<Integer, Integer> map;

        public Function(int capacity) {
            this.capacity = capacity;
            list = new LinkedList<>();
            map = new HashMap<>();
        }

        public int get(int key) {
            if (map.containsKey(key) == true) {
                list.removeFirstOccurrence(key);
                list.addFirst(key);
                return map.get(key);
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (map.containsKey(key) == false) {
                if (list.size() == capacity) {
                    int last = list.removeLast();
                    map.remove(last);
                }
                list.addFirst(key);
                map.put(key, value);
            } else {
                map.put(key, value);
            }
        }
    }
}
