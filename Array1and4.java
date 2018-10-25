package ru.geekbrains.Lesson6;
import java.lang.String;
import java.util.Random;

public class Array1and4 {
    protected int n;
    int [] a = new int [] {};

    public Array1and4(int n) {
        a = new int [n];
        Random r = new Random();
        for (int i=0; i<n; i++) {
            int j = r.nextInt(2);
            if (j==1) {
                a[i]=1;
            }
            else {
                a[i]=4;
            }
        }
    }
    public boolean exist1and4(int n) {
        boolean b1=false;
        boolean b4=false;
        for (int i=0; i<n; i++) {
            if (this.a[i]==1) {
                b1=true;
            }
            if (this.a[i]==4) {
                b4=true;
            }
        }
        if (b1 && b4) return true;
        else return false;
    }
}
