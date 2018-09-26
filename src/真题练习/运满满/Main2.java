package 真题练习.运满满;

import java.util.*;

/**
 * @auther: yanlin
 * @date: 2018/9/19 22:08
 * @description:
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//猴子
        int m = in.nextInt();//桃子
        int[] taozi = new int[m];
        for (int i = 0; i < m; i++) {
            taozi[i] = in.nextInt();
        }
        Map<Integer, houzi> map = new TreeMap<Integer, houzi>();
        for (int i = 0; i < n; i++) {
            int zhandouli = in.nextInt();
            int jiezhi = in.nextInt();
            map.put(i, new houzi(zhandouli, jiezhi));

        }

    }

    public static class houzi implements Comparable<houzi>{
        public int zhandouli;
        public int jiezhi;

        public houzi(int zhandouli, int jiezhi) {
            this.zhandouli = zhandouli;
            this.jiezhi = jiezhi;
        }

        @Override
        public int compareTo(houzi o) {
            return this.zhandouli-o.zhandouli;
        }
    }
}
