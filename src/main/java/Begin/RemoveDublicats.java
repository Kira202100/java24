package Begin;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDublicats {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 5);
        Set <Integer> noDubl= new HashSet<>();
        for (int i=0; i<numbers.size(); i++){
            noDubl.add(numbers.get(i));
        }
        System.out.println(numbers);
        System.out.println(noDubl);


    }
}
