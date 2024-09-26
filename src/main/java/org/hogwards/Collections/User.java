package org.hogwards.Collections;

import org.hogwards.Map.Faculte;
import org.hogwards.Map.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
    private static final Set<String> VALID_JOBS= new HashSet<>(Arrays.asList("Google", "Uber", "Amazon"));
    private static final Set<String> VALID_ADDRESSES = new HashSet<>(Arrays.asList("London”, “New York”, “Amsterdam"));
    private String name;
    private int age;
    private String work;
    private String adress;


//    public User(String name, int age, String work, String adress) {
//        if (!name.isEmpty() && age>=18 && VALID_JOBS.contains(work) && VALID_ADDRESSES.contains(adress)) {
//            this.name = name;
//            this.age = age;
//            this.work = work;
//            this.adress = adress;
//        } else {
//            throw new IllegalArgumentException("Incorrect");
//        }
//
//    }


    public User(String name, int age, String work, String adress) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public static Map<String, List<User>> groupUsers(List<User> users) {
        Map<String, List<User>> mapUsers = new HashMap<>();
        for (User user: users) {
        mapUsers.computeIfAbsent(user.getAdress(), key -> new ArrayList<>()).add(user);
        }
        return mapUsers;
    }

}



