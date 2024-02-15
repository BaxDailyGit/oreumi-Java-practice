package p0215.collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("DBMS");

        System.out.println("총 객체수: " + set.size());  // 저장된 객체수 출력

        //향상된 for문
        System.out.println("향상된 for문으로 출력");
        for (String element : set) {
            System.out.println("\t" + element);
        }

        System.out.println("반복자를 이용한 출력");
        Iterator<String> iterator = set.iterator();    // 반복자 얻기
        while (iterator.hasNext()) {              // 객체 수 만큼 루핑
            String element = iterator.next();       // 한 개의 객체를 가져온다
            System.out.println("\t" + element);
        }

        set.remove("DBMS");      // 한 개의 객체 삭제
        set.remove("Java");      // 한 개의 객체 삭제
        System.out.println("총 객체수: " + set.size());


        System.out.println("remove 이후 반복자를 이용한 출력");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }


        set.clear();       // 모든 객체를 제거하고 비움
        System.out.println("clear !");
        System.out.println("총 객체수: " + set.size());
        if (set.isEmpty()) {
            System.out.println("비어있음");
        }
    }
}