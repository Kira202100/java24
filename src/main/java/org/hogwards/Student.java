package org.hogwards;

import java.util.Arrays;

public class Student implements  Comparable<Student> {
    private String name;
    private int age;
    private String facultet;
    private int year;
    private String[] uniqueSkills = new String[3];

    public Student(String name, int age, String facultet) {
        this.name = name;
        this.age = age;
        this.facultet = facultet;
        this.uniqueSkills = uniqueSkills;
    }

    public Student(String name,  String facultet, int year) {
        this.name = name;
        this.facultet = facultet;
        this.year = year;
    }

    public void setUniqueSkills(String[] uniqueSkills) {
        if (uniqueSkills.length > 3) {
            this.uniqueSkills = Arrays.copyOfRange(uniqueSkills, 0, 3);
            System.out.println("The student has fewer skills");
        } else {
            this.uniqueSkills = uniqueSkills;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFacultet() {
        return facultet;
    }

    public String[] getUniqueSkills() {
        return uniqueSkills;
    }

    public void castSpell(Spell spell) {
        if (this.age <= 11) {
            if (spell.getPower() == 1) {
                System.out.println(this.name + " использовал заклинание " + spell.getTitle());
            } else {
                throw new SpellCastExeption(this.name + " is too young to use " + spell.getTitle());
            }
        } else if (this.age == 12) {
            if (spell.getPower() <= 2) {
                System.out.println(this.name + " used a spell " + spell.getTitle());
            } else {
                throw new SpellCastExeption(this.name + " can't use " + spell.getTitle());
            }
        } else if (this.age == 13) {
            if (spell.getPower() <= 3) {
                System.out.println(this.name + " used a spell " + spell.getTitle());
            } else {
                throw new SpellCastExeption(this.name + " can't use " + spell.getTitle());
            }
        } else if (this.age == 14) {
            if (spell.getPower() <= 4) {
                System.out.println(this.name + " used a spell " + spell.getTitle());
            } else {
                throw new SpellCastExeption(this.name + " can't use " + spell.getTitle());
            }
        } else if (this.age == 15) {
            if (spell.getPower() <= 5) {
                System.out.println(this.name + " used a spell " + spell.getTitle());
            } else {
                throw new SpellCastExeption(this.name + " can't use " + spell.getTitle());
            }
        } else if (this.age == 16) {
            if (spell.getPower() <= 6) {
                System.out.println(this.name + " used a spell " + spell.getTitle());
            } else {
                throw new SpellCastExeption(this.name + " can't use " + spell.getTitle());
            }
        } else if (this.age >= 17) {
            System.out.println(this.name + " used a spell ");
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return this.name+" "+ this.age +" " +this.facultet;
    }
}
