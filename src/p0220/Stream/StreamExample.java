package p0220.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        // 2차원 배열
        int[][] intArray = {{1, 2}, {3, 4}, {5, 6}};

        // 스트림 flatMap을 사용하여 1차원 배열로 만들기
        List<Integer> list = Arrays.stream(intArray) // int 배열의 스트림 생성
                .flatMapToInt(Arrays::stream) // 각 배열을 flatMap하여 IntStream으로 만듦
                .boxed() // IntStream을 Stream<Integer>로 변환
                .collect(Collectors.toList()); // 리스트로 변환

        //출력
        list.forEach(System.out::print);

        //스트림으로 오름차순 정렬하기
        List<Integer> a = Arrays.asList(15, 6, 7, 8, 2, 1);
        a.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
