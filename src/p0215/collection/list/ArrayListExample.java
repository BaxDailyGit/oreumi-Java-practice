package p0215.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("첫번째");
        list.add("두번째");
        list.add("세번째");

        String element1 = list.get(0);
        boolean isContain = list.contains("첫번째");
        System.out.println(element1);
        System.out.println("isContain = " + isContain);

        System.out.println("list : " + list);
        list.remove(1);
        System.out.println("list : " + list);

        list.clear();
        System.out.println("list : " + list);

        list = null;
        if (list == null) {
            System.out.println("리스트가 비었습니다.");
        }
    }
}
