package University;

import java.util.Objects;

public class FaculteNew {
    private String name;
    private int year;

    public FaculteNew(String nane, int year) {
        this.name = nane;
        this.year = year;

    }

    public String getNane() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FaculteNew)) return false;
        FaculteNew that = (FaculteNew) o;
        return getYear() == that.getYear() && Objects.equals(getNane(), that.getNane());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNane(), getYear());
    }

    @Override
    public String toString() {
        return "FaculteNew{" +
                "nane='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
