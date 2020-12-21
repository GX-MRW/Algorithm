import java.util.*;

/**
 * @Author： wgx
 * @Date 2020-12-02-11:52.
 * @Description: PACKAGE_NAME
 * @verson：1.0
 */
public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        list.add("asd1");
        list.add("asd2");
        list.add("asd3");
        list.add("asd4");
        list.add("asd5");
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()){
//            int i = iterator.nextIndex();
//            String next = iterator.next();
//            System.out.println(i+"  "+next);
//        }
        long count = list.stream().peek(System.out::println).count();
        System.out.println(count);

    }
}
