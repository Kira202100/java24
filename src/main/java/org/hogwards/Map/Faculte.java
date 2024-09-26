package org.hogwards.Map;

import java.util.Objects;

public class Faculte {
    private String name;
    private int year;

    public Faculte(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculte)) return false;
        Faculte faculte = (Faculte) o;
        return getYear() == faculte.getYear() && Objects.equals(getName(), faculte.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear());
    }

    @Override
    public String toString() {
        return "Faculte{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}



