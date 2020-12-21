import java.util.Arrays;

/**
 * @Author： wgx
 * @Date 2020-04-12-17:40.
 * @Description: 插入排序
 * @verson：1.0
 */
public class InsertionSort {
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
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j >0; j--) {
                if (a[j]<a[j-1]) {
                    swap(a, j, j - 1);
                }
            }
        }

    }
}
