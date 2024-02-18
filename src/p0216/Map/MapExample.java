package p0216.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "레드향");
        map.put(2, "사과");
        map.put(3, "바나나");
        map.put(4, "샤인머스켓");

        //iterate를 사용해서 Map의 key와 value를 출력하기
        Iterator<Integer> keys = map.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            System.out.println("[key]:" + key + ", [value]:" + map.get(key));
        }
    }
}
