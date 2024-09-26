package Begin;

import java.util.HashSet;

public class SubsetCheck {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(2);
        set2.add(5);
        System.out.println(set1.containsAll(set2));


        }
    }
