package org.hogwards.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ReverseMapping {
    public static void main(String[] args) {
        HashMap<String, String> capitalCountryMap = new HashMap<>();
        capitalCountryMap.put("Paris", "France");
        capitalCountryMap.put("Berlin", "Germany");
        capitalCountryMap.put("Rome", "Italy");

        HashMap<String, String> countryCapitalMap = new HashMap<>();
        for(HashMap.Entry<String, String> entry : capitalCountryMap.entrySet()){
            countryCapitalMap.put(entry.getValue(), entry.getKey());
        }
        for (HashMap.Entry entry: countryCapitalMap.entrySet()) {
            System.out.println(entry);

        }

//        countryCapitalMap.forEach((String,String) -> System.out.println("Country:  "+String+"  Capital: "+ String));
        }
}
