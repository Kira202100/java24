package org.hogwards.Map;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Faculte griffindorOneCourse = new Faculte("Griffindor", 1);
        Faculte sliserinOneCourse = new Faculte("Sliserin", 1);
        Faculte griffindorTooCourse = new Faculte("Griffindor", 2);
        Faculte griffindorThreeCourse = new Faculte("Griffindor", 3);
        Faculte sliserinTooCourse = new Faculte("Sliserin", 2);
        Faculte sliserinTreeCourse = new Faculte("Sliserin", 3);

        Student draco = new Student("Draco", sliserinTooCourse, 2);
        Student ginny = new Student("Ginny", griffindorOneCourse, 1);
        Student rufus = new Student("Rufus", sliserinTreeCourse, 3);
        Student polumna = new Student("Polumna", griffindorThreeCourse, griffindorThreeCourse.getYear());
        Student malfoy1 = new Student("Malfoy", sliserinTooCourse, 2);
        Student sedrik = new Student("Sedrik", griffindorThreeCourse, 3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(draco);
        students.add(ginny);
        students.add(rufus);
        students.add(polumna);
        students.add(malfoy1);
        students.add(sedrik);
        List<Student> studentList = Arrays.asList(draco, ginny, rufus, polumna, malfoy1);


//        System.out.println(transform(studentList));
//        adStudent(sedrik, studentList);    !!!!!!!
//        System.out.println(studentList);
//        findStudent("Sliserin",1,transform(studentList));
       

    }

    public static Map<Faculte, List<Student>> transform(List<Student> students) {
        Map<Faculte, List<Student>> mapFaculte = new HashMap<>();
        for (Student student : students) {
//            mapFaculte.computeIfAbsent(student.getFaculte(),v->new ArrayList<>()).add(student);
            if (mapFaculte.containsKey(student.getFaculte())) {
                mapFaculte.get(student.getFaculte()).add(student);
            } else {
                List<Student> studentListG = new ArrayList<>();
                studentListG.add(student);
                mapFaculte.put(student.getFaculte(), studentListG);
            }
        }
        return mapFaculte;
    }

    public static void findStudent(String faculte, int year, Map<Faculte, List<Student>> faculteListMap) {
        List<Student>  sortFaculteList = faculteListMap.get(new Faculte(faculte,year));
        if (sortFaculteList == null) {
            System.out.println("Not found");
            return;
        }
         sortFaculteList.forEach(student-> System.out.println(student.getName()));
    }


}

