package p0219.LambdaExpresson;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        // Runnable은 매개변수가 없고 리턴값이 없는 람다식
        Runnable r = () -> System.out.println("Runnable은 매개변수가 없고 리턴값이 없는 람다식입니다.");
        r.run();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("출력문 테스트");
            }
        };
        System.out.println();

        // Supplier는 매개변수가 없고 리턴값이 있는 람다식
        Supplier<String> s = () -> "Supplier는 매개변수가 없고 리턴값이 있는 람다식입니다.";
        String result = s.get();
        System.out.println(result);
        System.out.println();
        //LongSupplier
        LongSupplier ls = () -> 100L;
        System.out.println(ls.getAsLong());
        System.out.println();



        // Consumer는 매개변수가 있고 리턴값이 없는 람다식
        Consumer<String> c = (a) -> System.out.println(a + "는 매개변수가 있고 리턴값이 없는 람다식입니다.");
        c.accept("consumer");
        System.out.println();
        //DoubleConsumer



        // Function은 매개변수가 있고 리턴값이 있는 람다식
        System.out.println("Function<T, R>는 매개변수가 있고 리턴값이 있는 람다식입니다. T타입 입력값을 받아서 R타입 출력값을 반환하는 함수형 인터페이스입니다. ");
        Function<Integer, String> f = a -> String.valueOf(a);
        Function<Integer, String> f2 = b -> String.valueOf(b) +100;
        String apply = f.apply(100);
        System.out.println("apply = " + apply);
        String apply2 = f2.apply(100);
        System.out.println("apply2 = " + apply2);
        System.out.println();

        // Predicate는 매개변수가 있고 리턴값이 있는 람다식
        System.out.println("Predicate<T>는 매개변수가 있고 리턴값이 있는 람다식입니다. T타입의 입력값을 받아서 boolean타입의 출력값을 반환하는 함수형 인터페이스입니다.");
        Predicate<String> isEmptyStr = p -> p.length()==0;
        String str = "";
        if (isEmptyStr.test(str)) { // if(s.length()==0)
            System.out.println("This is an empty String.");
        }


    }
}

