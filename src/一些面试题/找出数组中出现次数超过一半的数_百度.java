package 一些面试题;

/**
 * @auther: yanlin
 * @date: 2018/9/16 21:50
 * @description:
 */
public class 找出数组中出现次数超过一半的数_百度 {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1,4,2,3,4,4,2,3};
        System.out.println(FindMostData(arr));
    }

    static int FindMostData(int arr[]) {
        int findNum = 0; // 出现次数超过一半的数；
        int count = 0; // 只要最终count > 0，那么对应的findNum就是出现次数超过一半的数；

        // 循环过程中，i每增加一次，就相当于把i之前的所有元素（除了满足“findNum == arr[i]”条件的arr[i]，
        // 这些对应元素用“count++”来标记）都抛弃了，
        // 但是之后每当执行一次“ count-- ”时，
        // 又会从前面这些已保留的且等于findNum的元素中删除一项，直到count == 0，
        // 再重选findNum；
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) // count为0时，表示当前的findNum需要重选；
            {
                findNum = arr[i];
                count = 1;
            } else {
                if (findNum == arr[i])
                    count++;
                else
                    count--;
            }
        }
        return findNum;
    }
}
