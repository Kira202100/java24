package org.hogwards.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 3, 4, 5, 1};
        Map <Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(i, arr[i]);
        }


//        map.forEach((Integer,Integer)-> System.out.println("Key: " +Integer+" Value: "+Integer));

        for (Map.Entry <Integer,Integer>entry: map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
//            System.out.println(entry);
        }
        Set<Integer> keys = map.keySet();
        System.out.println(keys.size());
    }
}
