package p0215.map;

import java.util.*;
import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        System.out.println(hashMap);
        boolean isContain = hashMap.containsKey("key0");
        System.out.println("isContain = " + isContain);
        boolean ContainValue = hashMap.containsValue(3);
        System.out.println("ContainValue = " + ContainValue);

        Set<String> keySet = hashMap.keySet();
        System.out.println("keySet : " + keySet);

        System.out.println("Iterator를 활용");
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = hashMap.get(key);
        }

        System.out.println("Entry를 활용");
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Object value = entry.getValue();
        }

        //get()과  getOrDefault()
        Integer value = hashMap.get("key1");
        System.out.println("get으로만 받은 value = " + value);
        Integer value2 = hashMap.getOrDefault("key0", 0);
        System.out.println("getOrDefault로 받은 value = " + value2);

    }
}
