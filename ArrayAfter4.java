package ru.geekbrains.Lesson6;

import java.util.*;

public class ArrayAfter4 {
    protected int n;
    int [] a = new int [] {};

    public ArrayAfter4(int n) {
        a = new int [n];
        Random r = new Random();
        for (int i=0; i<n; i++) {
            int j = r.nextInt(10);
            a[i]=j;
        }
    }
    public int[] getArrayAfter4(int n) {
        try {
            if (this.a[n-1]==4) {
                throw new RuntimeException("4 is last digit in array");
            }
            int k = -1;
            for (int i=n-1; i>=0; i--) {
                if (this.a[i]==4) {
                    k=i;
                    break;
                }
            }
            if (k<0) {
                throw new RuntimeException("There is no digit 4 in array");
            }
            else {
                int [] suba = new int[n-k-1];
                System.arraycopy(this.a,k+1,suba,0,suba.length);
                return suba;
            }
        }
        catch(Exception ex) {
            return null;
        }
    }
}
