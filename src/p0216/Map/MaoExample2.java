package p0216.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaoExample2 {
    public static void main(String[] args) {

            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> list = Arrays.asList(3,3,5,8,2,2);

            //리스트의 있는 각 숫자들의 총 개수를 map에 저장
            for (int i = 0; i < list.size(); i++) {
                if (map.containsKey(list.get(i))) {
                    map.put(list.get(i), map.get(list.get(i)) + 1);
                } else {
                    map.put(list.get(i), 1);
                }
            }
            //map 출력
            for (Integer key : map.keySet()) {
                System.out.println("key: " + key + ", value: " + map.get(key));
            }
        }
    }
