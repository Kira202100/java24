package org.hogwards.Map;

public class Student {
    private String name;
    private Faculte faculte;
    private int year;

    public Student(String name, Faculte faculte, int year) {
        this.name = name;
        this.faculte = faculte;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculte=" + faculte +
                ", year=" + year +
                '}';
    }
}
