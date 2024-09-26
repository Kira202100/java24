package org.hogwards;

import java.util.Comparator;

public class StudentsFacultetComparator implements Comparator <Student> {
    @Override
    public int compare (Student student1, Student student2){
        return student1.getFacultet().compareTo(student2.getFacultet());
    }
}
