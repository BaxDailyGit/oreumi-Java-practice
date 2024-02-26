package p0220.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamCollectExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", "d", "d");

        List<String> returnlist = list.stream()
                .distinct()
                .collect(Collectors.toList());

        returnlist.forEach(System.out::print);
        System.out.println();
        System.out.println();

        //set
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> set = list2.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toSet());

        set.stream().forEach(System.out::print);  // {1, 3, 5}
        System.out.println();
        System.out.println();

        //groupingBy
        List<Integer> list3 = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        Map<Integer, Long> result = list3.stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()  // 그룹핑 후 집계하는 메소드
                        )
                );
        System.out.println(result);  // {1=2, 2=3, 3=1, 4=1, 5=3}.
        System.out.println();


        //중복제거후 list String으로 변환 후 출력
        List<Integer> list4 = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        String result4 = list4.stream()
                .distinct()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(", "));
        System.out.println(result4);  // 1, 2, 3, 4, 5
        System.out.println();








    }
}
