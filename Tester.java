

import java.io.*;
import java.io.FileReader;
import java.util.StringTokenizer;


public class Tester {
    static Student[] students = new Student[6];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("t.txt"));
        StringTokenizer tokenizer;
        for (int i = 0; i < 6; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            students[i] = new Student(tokenizer.nextToken(), Integer.valueOf(tokenizer.nextToken()));
        }
        selection();
        inversion();
        shell();
        merge();
        quick();
    }

//selection
    private static void selection(){
        System.out.println("Selection sort: ");
        SelectionSort.sort(students, Student.stg);
        for (Student g : students) {
            System.out.println(g);
        }
        System.out.println("                                                   ");
        SelectionSort.sort(students, Student.stn);
        for (Student g : students) {
            System.out.println(g);
        }
    }

//inversion
    private static void inversion(){
        System.out.println("Inversion sort:");
        InsertionSort.sort(students, Student.stn);
        for (Student g : students) {
            System.out.println(g);
        }
        System.out.println("                                                                ");
        InsertionSort.sort(students, Student.stg);
        for (Student g : students) {
            System.out.println(g);
        }
    }
//quick sort
    private static void quick(){
        System.out.println("QuickSort:");
        QuickSort.sort(students, Student.stg);
        for (Student g : students){
            System.out.println(g);
        }
        System.out.println("                                           ");
        QuickSort.sort(students, Student.stn);
        for (Student g : students){
            System.out.println(g);
        }
    }

//shell
    private static void shell(){
        System.out.println("ShellSort: ");
        ShellSort.sort(students, Student.stg);
        for (Student g : students) {
            System.out.println(g);
        }
        System.out.println("                                                      ");
        ShellSort.sort(students, Student.stn);
        for (Student g : students) {
            System.out.println(g);
        }
    }
//merge
    private static void merge(){
        System.out.println("MergeSort: ");
        MergeSort.sort(students, Student.stn);
        for (Student g : students) {
            System.out.println(g);
        }
        System.out.println("                                           ");
        MergeSort.sort(students, Student.stg);
        for (Student g : students) {
            System.out.println(g);
        }
    }
}