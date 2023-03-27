import java.util.Comparator;

public class FirstSort {

    static boolean less(Student v, Student w, Comparator<Student> d){
        return d.compare(v,w)<0;
    }

    static void exch(Student[] a, int i, int j){
        Student swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

}
