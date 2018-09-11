package 真题练习.头条;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther: yanlin
 * @date: 2018/9/9 10:36
 * @description:
 */
public class IP {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ipAddress = in.nextLine();
        System.out.println(fun(ipAddress));
    }


    public static int fun(String ipAddress) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> t = new ArrayList<>();
        isRight(result, ipAddress, 0, t);
//        ArrayList<String> finalResult = new ArrayList<>();
//        System.out.println(result);
//        for (ArrayList<String> l : result) {
//            StringBuilder sb = new StringBuilder();
//            for (String str : l) {
//                sb.append(str + ".");
//            }
//            sb.setLength(sb.length() - 1);
//            finalResult.add(sb.toString());
//        }
//        System.out.println(finalResult);
        return result.size();
    }

    public static void isRight(ArrayList<ArrayList<String>> result, String ipAddress, int start, ArrayList<String> t) {

        int ipLen=ipAddress.length();
        if (t.size() >= 4 && start != ipLen)
            return;
        if ((t.size() + ipLen - start + 1) < 4)
            return;
        if (t.size() == 4 && start == ipLen) {
            ArrayList<String> temp = new ArrayList<>(t);
            result.add(temp);
        }
        for (int i = 1; i <= 3; i++) {
            if (start + i > ipLen)
                break;
            String sub = ipAddress.substring(start, start + i);
            if (i > 1 && ipAddress.charAt(start) == '0') {
                break;
            }
            if (Integer.valueOf(sub) > 255)
                break;
            t.add(sub);
            isRight(result, ipAddress, start + i, t);
            t.remove(t.size() - 1);
        }
    }

}

