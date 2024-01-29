package interView;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] init = {4, 1, 66, 8, -100, 154, 2, 0 , 1};

        for (int i = 0; i < init.length-1 ; i++) {
            for (int j = 0; j < init.length-i-1 ; j++) {
                if(init[j+1]>init[j]){
                    int b = init[j];
                    init[j] = init[j+1];
                    init[j+1] = b;
                }
            }
        }

        System.out.println(Arrays.toString(init));
    }
}
