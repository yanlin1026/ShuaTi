package 真题练习.携程;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/4 19:39
 * @description:
 */
public class Main1{
    public static  class LRUCache {

        private int capacity;
        private Map<Integer, Integer> cache;

        public LRUCache(final int capacity) {
            this.capacity = capacity;
            this.cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                    if (size() > capacity)
                        return true;
                    else
                        return false;
                }
            };
        }

        public int get(int key) {
            if (cache.containsKey(key)) {
                return cache.get(key);
            } else
                return -1;
        }

        public void put(int key, int value) {
            cache.put(key, value);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int capacity = Integer.parseInt(in.nextLine());
            LRUCache l = new LRUCache(capacity);

            while (in.hasNext()) {
                String s = in.nextLine();
                String[] str = s.split(" ");
                if (str[0].equals('p' + "")) {
                    int key = Integer.valueOf(str[1]);
                    int value = Integer.valueOf(str[2]);
                    l.put(key, value);
                } else {
                    int key = Integer.valueOf(str[1]);
                    int res = l.get(key);
                    System.out.println(res);
                }
            }
        }
    }
}
