package interView;

import java.util.Arrays;

public class minusminus {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0]=5;
        a[1]=5;
        int i = 2;
        a[--i]= --i;

        System.out.println(Arrays.toString(a));
    }
}
