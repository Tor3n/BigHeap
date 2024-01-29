package recursion;

import java.util.Arrays;

public class Fibbonachi {

    public static void main(String[] args) {
        //fib(n) = fib(n-1)+fib(n-2)
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
        //0  1  2  3  4  5   6  7   8   9   10   11   12
        int[] result= new int[12];
        for (int i = 0; i < 12; i++) {
            result[i]= fib(i);
        }
        System.out.println("fibs: "+ Arrays.toString(result));
    }

    static int fib(int num){
        if (num<2) {
            return 1;
        }
        return fib(num-1)+fib(num-2);
    }
}
