package org.hogwards.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Transformer {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("a", "b", "", "c", "d", "", "e", "f"));
//        System.out.println(list);
        System.out.println(transform(list));
    }

    public static List<String> transform(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("")) {
                words.remove(i);
            }
        } return words;
    }
}

