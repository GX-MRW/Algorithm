import java.util.Arrays;

/**
 * @Author： wgx
 * @Date 2020-04-10-17:10.
 * @Description: 冒泡排序
 * 从0开始，俩俩交换，直到数组最大位置
 * @verson：1.0
 */
public class BobbleSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 6, 8, 7, 5, 2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void sort(int[] a) {

        //方式一
//        for (int i = a.length; i > 1; i--) {
//            int minpos = 0;
//            for (int j = minpos + 1; j < i; j++) {
//                if (a[minpos] > a[j]) {
//                    swap(a, minpos, j);
//                }
//                minpos++;
//            }
//        }

        for (int i = a.length-1; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }


    }
}
