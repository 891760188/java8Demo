package ye.guo.huang;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 */

public class Test05 {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("abc", "abc", "bc", "efg", "abcd","", "jkl");
        /**
         * forEach
         */
//        list1.forEach(System.out :: println);
//        list1.stream().forEach(System.out :: println);

        /**
         * map
         * distinct() 是去重用的
         */
//        List<String> list2 = list1.stream().map(s -> s+"我").distinct().collect(Collectors.toList());
//            System.out.println(list2);

        /**
         * filter
         * 根据条件把需要的拿出来
         */
//        List<String> list3 = list1.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
//        System.out.println(list3);
//        System.out.println(list1.stream().filter(s -> s.isEmpty()).count() );


        /**
         * limit
         * sorted()排序
         */
//        Random random = new Random();
//        random.ints().limit(16).map(i -> i*i).filter(i -> i > 1).distinct().sorted().forEachOrdered(i -> {
//            System.out.println(i);
//        });

        /**
         * parallelStream 并行程序
         * collect(Collectors.toList());  将流转为集合
         * Collectors.joining("#")  集合转字符串 joining
         */
//        List<String> list4 = list1.parallelStream().filter(s -> !s.isEmpty()).map(s -> s+"你").distinct().sorted().collect(Collectors.toList());
//        list4.forEach(System.out :: println);
//        String str = list4.stream().collect(Collectors.joining("#"));
//        System.out.println(str);


        /**
         * 统计
         */
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics statistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getSum());
    }

}
