import java.util.Comparator;

public class ShellSort extends FirstSort {
    public static void sort(Student[] a, Comparator<Student> d){
        int n = a.length;

        int h = 1;
        while (h<n/3) h = 3*h+1; // 1, 4, 13, 40, 121, 364, ...

        while(h>=1){
            for (int i = h; i<n;i++){
                for (int j=i; j>=h;j-=h)
                    if (less(a[j],a[j-h], d))
                        exch(a,j,j-h);
                    else break;
            }
            h=h/3;
        }
    }
}
