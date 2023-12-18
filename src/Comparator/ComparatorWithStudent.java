package Comparator;

import java.util.Comparator;

public class ComparatorWithStudent implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.getName().compareTo(o2.getName());
        if (temp!=0) {
            return temp;
        }
        temp = o1.getAge() - o2.getAge();
        return temp;
    }
}
