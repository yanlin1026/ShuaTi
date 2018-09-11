package 真题练习;

import java.util.*;

public class wuping {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String string=in.nextLine();
        if (string==null||string.length()==0) {
            string=in.nextLine();
        }
        int[][] inin=new int[n][3];
        String[] stringlist = string.split(" ");
        inin[0][0]=Integer.valueOf(stringlist[0]);
        inin[0][1]=Integer.valueOf(stringlist[1]);
        inin[0][2]=Integer.valueOf(stringlist[2]);
        for (int i = 1; i < n; i++) {
            stringlist = in.nextLine().split(" ");
            inin[i][0]=Integer.valueOf(stringlist[0]);
            inin[i][1]=Integer.valueOf(stringlist[1]);
            inin[i][2]=Integer.valueOf(stringlist[2]);
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i!=j&&inin[i][0]<inin[j][0]&&inin[i][1]<inin[j][1]&&inin[i][2]<inin[j][2]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
