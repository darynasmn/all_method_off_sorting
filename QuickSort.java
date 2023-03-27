import edu.princeton.cs.algs4.StdRandom;

import java.util.Comparator;

public class QuickSort extends FirstSort{
    private static int partition(Student[] a, int lo, int hi, Comparator<Student> d){
        int i = lo, j = hi+1;
        while (true){
            while (less(a[++i], a[lo],d))
                if (i == hi) break;
            while (less(a[lo], a[--j],d))
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;

    }
    public static void sort(Student[] a, Comparator<Student> d){
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1,d);
    }
    private static void sort(Student[] a, int lo, int hi, Comparator<Student> d){
        if (hi <= lo) return;
        int j = partition(a, lo, hi,d);
        sort(a, lo, j-1,d);
        sort(a, j+1, hi,d);
    }

}
