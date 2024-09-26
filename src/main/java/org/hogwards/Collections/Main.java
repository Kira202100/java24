package org.hogwards.Collections;

import java.util.Arrays;
import java.util.List;



public class Main {
    public  static void main(String[] args) {
        User masha = new User("Masha", 22, "Uber", "Amsterdam");
        User kolya = new User("Kolya", 25, "Uber", "Amsterdam");
        User stefhan = new User("Stephan", 25, "Uber", "London");
        User alina = new User("Alina", 22, "Uber", "Amsterdam");
        User olya  = new User("Olya", 19, "Uber", "London");
        List<User> users = Arrays.asList(masha, kolya, stefhan, alina,olya);


        System.out.println(User.groupUsers(users));
//        for  (Map.Entry <Integer, List<User>> entry: sortUsers.entrySet()) {
//            Integer key = entry.getKey();
//            List<User> value = users;
//            System.out.println("Key: " + key + ", Value: " + value);
//            System.out.println(entry);
//        }
    }
}
