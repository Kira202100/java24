package org.hogwards.Animal;

import org.hogwards.Student;

import java.util.Random;

public class Hippogriff {
    private String name;
    private int age;
    private String color;
    private boolean uniqueSkills;


    public Hippogriff(String name, int age, String color, boolean uniqueSpells) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.uniqueSkills = uniqueSkills;
    }

    public Hippogriff(String name) {
        this.name = name;
    }
    public Hippogriff(String name,  String color) {
        this.color = color;
        this.name = name;
    }
    public Hippogriff() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public boolean isUniqueSkills() {
        return uniqueSkills;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String eat (String food) {
        if (food.equals("carrot")) {
            return "Be...I don't eat this";
        } else {
            return "niam-niam";
        }
    }
    public String fly(){
        if (Hippogriff.this.age>2){
            return Hippogriff.this.name +"  fly";
        } else {
            return Hippogriff.this.name +"  small from fly";
        }
    }

    public String giveRide(Student student){
       int isGivingRide = new Random().nextInt(1,10);
       if (isGivingRide <=3){
           return student.getName()+"fly for Hippogriff";
       } else if (isGivingRide>=4 && isGivingRide<=8){
           return "Hippogriff doesn't want to fly";
       } else {
           return "try again";
       }
    }
}
