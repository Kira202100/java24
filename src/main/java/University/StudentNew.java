package University;

import java.util.Objects;

public class StudentNew {
    private  String name;
    private FaculteNew faculte;

    public StudentNew(String name, FaculteNew faculte) {
        this.name = name;
        this.faculte = faculte;
    }

    public String getName() {
        return name;
    }


    public FaculteNew getFaculte() {
        return faculte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentNew)) return false;
        StudentNew that = (StudentNew) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getFaculte(), that.getFaculte());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFaculte());
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "name='" + name + '\'' +
                ", faculte=" + faculte +
                '}';
    }
}
