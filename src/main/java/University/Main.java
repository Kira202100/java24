package University;

import Vesteros.Book;
import org.hogwards.Map.Faculte;
import org.hogwards.Map.Student;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<FaculteNew, List<StudentNew>> mapFaculteNew = new HashMap<>();
    private static List<StudentNew> studentNewList = new ArrayList<>();
    private static Map<StudentNew, Integer> mapStudents = new HashMap<>();

    public static void main(String[] args) {

        FaculteNew phisicsOne = new FaculteNew("Phisics", 1);
        FaculteNew byologyToo = new FaculteNew("Byology", 2);
        FaculteNew byologyThre = new FaculteNew("Byology", 3);
        FaculteNew economicOne = new FaculteNew("Economic", 1);
        FaculteNew economicThree = new FaculteNew("Economic", 3);

        StudentNew kolya = new StudentNew("Kolya", phisicsOne);
        StudentNew sasha = new StudentNew("Sasha", byologyToo);
        StudentNew olya = new StudentNew("Olya", byologyToo);
        StudentNew sveta = new StudentNew("Sveta", byologyThre);
        StudentNew max = new StudentNew("Max", economicOne);
        StudentNew serg = new StudentNew("Serg", economicThree);

       adStudent(kolya);
       adStudent(sasha);
       adStudent(olya);
       adStudent(sveta);
       adStudent(max);
       adStudent(serg);
       printList();
        System.out.println();
        remooveStudent(sasha);
        remooveStudent(max);
        printList();
//
    }

    public static Map<FaculteNew, List<StudentNew>> transform(List<StudentNew> students) {
        for (StudentNew studentNew : students) {
            if (mapFaculteNew.containsKey(studentNew.getFaculte())) {
                mapFaculteNew.get(studentNew.getFaculte()).add(studentNew);
            } else {
                List<StudentNew> studentNewListG = new ArrayList<>();
                studentNewListG.add(studentNew);
                mapFaculteNew.put(studentNew.getFaculte(), studentNewListG);
            }
        }
        return mapFaculteNew;
    }

    public static void adStudent(StudentNew studentNew) {
        studentNewList.add(studentNew);
        int index = studentNewList.size() - 1;
        mapStudents.put(studentNew, index);
    }

    private static void printMapStudents() {
        for (Map.Entry<FaculteNew, List<StudentNew>> entry : transform(studentNewList).entrySet()) {
            System.out.println("Faculte  : " + entry.getKey().toString() + ", Students:  " + entry.getValue().toString());
        }
    }
    public static void printList(){
        for (StudentNew studentNew:studentNewList) {
            System.out.println(studentNew);
        }
    }

    public static void remooveStudent(StudentNew studentNew) {
        int index = mapStudents.get(studentNew);
        studentNewList.set(index,studentNewList.get(studentNewList.size()-1));
        mapStudents.put(studentNewList.get(studentNewList.size()-1),index);
        studentNewList.remove(studentNewList.size()-1);

    }
//    public static void findStudent (String nameFaculte,int year, Map<FaculteNew,List<StudentNew>> map){
//        List<StudentNew> listStudent = map.get(new FaculteNew(nameFaculte,year));
//        if(listStudent==null){
//            System.out.println("not found");
//            return;
//        }
//        listStudent.forEach(studentNew -> System.out.println(studentNew.getName()));
//    }
}




