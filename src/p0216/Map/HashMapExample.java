package p0216.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample {
    public static void main(String[] args) {

        // 1. Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        map.put("자바공부", 100);
        map.put("알고리즘solve", 90);
        map.put("운동", 80);
        System.out.println("총 Entry 수: " + map.size());    // 저장된 총 Entry 수 얻기
        System.out.println();

        // 2. 객체 찾기
        System.out.println("객체 찾기");
        System.out.println("\t알고리즘solve: " + map.get("알고리즘solve"));
        System.out.println();

        // 3. 객체를 하나씩 처리
        System.out.println("객체를 하나씩 처리");
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 4. 객체 삭제
        System.out.println("객체 삭제");
        map.remove("운동");
        System.out.println("총 Entry 수: " + map.size());

        // 5. 객체를 하나씩 처리
        System.out.println("객체를 하나씩 처리");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 6. 모든 Map.Entry 삭제}
        System.out.println("모든 Map.Entry 삭제");
        map.clear();
        System.out.println("총 Entry 수: " + map.size());
    }
}
