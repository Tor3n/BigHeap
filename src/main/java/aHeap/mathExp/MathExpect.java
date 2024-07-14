package mathExp;

import java.io.*;
import java.util.Arrays;

public class MathExpect {
    public static void main(String[] args) throws IOException {
        System.out.println("set iterations and dices power");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        String[] reslts = input.split(" ");

        System.out.println("You've inserted: "+reslts[0]+" "+reslts[1]);

        int iter = Integer.parseInt(reslts[0]);
        int dP = Integer.parseInt(reslts[1]);
        int sum = 0;
        for (int i = 0; i < iter-1; i++) {
            Double ran = Math.random()*5+1;
            int rani = (int) Math.round(ran);
            System.out.println("roll: "+rani);
            sum+=rani;
        }

        double mean = ((double) sum)/iter;
        System.out.println(sum);
        System.out.println(iter);
        System.out.println("mean is: "+ mean);
    }
}
