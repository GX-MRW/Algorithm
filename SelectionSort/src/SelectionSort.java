import java.util.Arrays;

/**
 * @Author： wgx
 * @Date 2020-04-10-14:13.
 * @Description: 选择排序
 * @verson：1.0
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {21, 1, 23, 42, 3, 15, 2};
        // a.length-1 保证遍历还剩一个数
//        for (int i = 0; i < a.length-1; i++) {
//            //定义开始下标
//            int minpos = i;
//            for (int j = i + 1; j < a.length; j++) {
//                minpos=a[minpos] > a[j]?j:minpos;
//            }
//            int temp = a[i];
//            a[i] = a[minpos];
//            a[minpos] = temp;
//            System.out.println(Arrays.toString(a));
//        }
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                min=a[min]>a[j]?j:min;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            //System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}
