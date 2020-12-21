import java.util.Arrays;
import java.util.Random;

/**
 * @Author： wgx
 * @Date 2020-04-10-18:19.
 * @description: 对数器
 * @verson：1.0
 */
public class Datachecker {
    static int[] generateRandomArray() {
        Random random = new Random();
        int[] ints = new int[10000];
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=random.nextInt(10000);
        }
        return ints;
    }
    static void check(){
        int[] arr=generateRandomArray();
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        Arrays.sort(arr);
        InsertionSort.sort(arr2);
        boolean name=true;
        for (int i = 0; i <arr2.length ; i++) {
            if (arr[i]!=arr2[i]) {
                name=false;
            }
        }
        System.out.println(name==true?"right":"wrong");
    }

    public static void main(String[] args) {
        check();
    }
}
