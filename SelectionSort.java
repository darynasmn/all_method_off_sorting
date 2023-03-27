import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort extends FirstSort{

    public static void sort(Student[] a, Comparator<Student> d){
        int n = a.length;
        for (int i=0;i<n;i++){
            int min = i;
            for (int j = i+1;j<n;j++)
                if (less(a[j],a[min], d))
                    min = j;
            exch(a,i,min);
        }
    }

}
