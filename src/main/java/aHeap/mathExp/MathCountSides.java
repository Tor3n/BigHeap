package mathExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class MathCountSides {
    public static void main(String[] args) throws IOException {
        System.out.println("set iterations and dices power");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        String[] reslts = input.split(" ");

        System.out.println("You've inserted: "+reslts[0]+" "+reslts[1]);

        int iter = Integer.parseInt(reslts[0]);
        int dP = Integer.parseInt(reslts[1]);
        int sum = 0;
        Object[] sides = new Object[dP];
        Arrays.fill(sides, 0);

        for (int i = 0; i < iter-1; i++) {
            Random rand = new Random();
            //Double ran = Math.random()*5+1;
            Double ran = rand.nextDouble()*(dP-1)+1;
            int rani = (int) Math.round(ran);
            //System.out.println("roll: "+rani);
            sum+=rani;
            sides[rani-1] = Integer.parseInt(sides[rani-1].toString())+1;
        }


        System.out.println("sides distribution "+ Arrays.deepToString(sides));
        double mean = ((double) sum)/iter;
        System.out.println(sum);
        System.out.println(iter);
        System.out.println("mean is: "+ mean);
    }
}
