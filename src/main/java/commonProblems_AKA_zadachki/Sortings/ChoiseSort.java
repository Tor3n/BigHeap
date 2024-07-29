package Sortings;

import java.util.Arrays;

public class ChoiseSort {


    public static void main(String[] args) {
        int[] a = new int[]{11,2,44,5,3, -13123, 3,54545,-1,44};

        for (int i = 0; i < a.length; i++) {
            int max = a[0];
            int maxP = 0;
            for (int j = 0; j < a.length-i; j++) {
                //System.out.println(a[j]);
                if (a[j] > max) {
                    max = a[j];
                    maxP = j;
                }
            }
            int b = a[a.length-1-i];
            a[a.length-1-i]=max;
            a[maxP] = b;
        }
        System.out.println(Arrays.toString(a));


    }



}
