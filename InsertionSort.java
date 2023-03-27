import java.util.ArrayList;
import java.util.Comparator;

public class InsertionSort extends FirstSort {
    private static boolean isSorted(Student[] a, Comparator<Student> d){
        for (int i=1;i<a.length;i++)
            if (less(a[i],a[i-1],d)) return false;
        return true;
    }
    public static void sort(Student[] a, Comparator<Student> d){
        int n = a.length;
        for (int i=0;i<n;i++){
            for (int j = i;j>0;j--)
                if (less(a[j],a[j-1], d))
                    exch(a,j,j-1);
                else break;
        }
    }
    public static void sort(Student[] a, int l, int h, Comparator<Student> d){
        for (int i=l;i<=h;i++){
            for (int j = i;j>0;j--)
                if (less(a[j],a[j-1],d))
                    exch(a,j,j-1);
                else break;
        }
    }

}
