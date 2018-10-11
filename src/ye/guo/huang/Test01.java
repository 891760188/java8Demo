package ye.guo.huang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        List<Integer> list4 = new ArrayList<Integer>();

        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(5);
        list1.add(4);
        list1.add(3);

        list2.add(2);
        list2.add(0);
        list2.add(1);
        list2.add(5);
        list2.add(4);
        list2.add(3);

        list3.add(2);
        list3.add(0);
        list3.add(1);
        list3.add(5);
        list3.add(4);
        list3.add(3);

        list4.add(2);
        list4.add(0);
        list4.add(1);
        list4.add(5);
        list4.add(4);
        list4.add(3);

        Collections.sort(list1);

        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        //java8 的箭头函数
        Collections.sort(list3,(o1,o2) -> o1.compareTo(o2));

        Collections.sort(list4,(o1,o2) -> {
            return o1.compareTo(o2) ;
        });

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

    }
}
