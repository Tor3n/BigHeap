package mathExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Check if util.Random gives us uniformal distribution and not a Gaussian one
 * it is used to emulate Dice throwing
 */

public class GaussianCheck {
    public static void main(String[] args) throws IOException {
        System.out.println("set iterations and dices power");

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        String[] reslts = input.split(" ");

        System.out.println("You've inserted: "+reslts[0]+" "+reslts[1]);

        int iter = Integer.parseInt(reslts[0]);
        int dP = Integer.parseInt(reslts[1]);
        int sum = 0;
        Object[] sides = new Object[dP+1];
        Arrays.fill(sides, 0);

        for (int i = 0; i < iter-1; i++) {
            Random rand = new Random();

            int rani = rand.nextInt(dP+1);

            //System.out.println("roll: "+rani);
            sum+=rani;
            sides[rani] = Integer.parseInt(sides[rani].toString())+1;
        }


        System.out.println("sides distribution "+ Arrays.deepToString(sides));
        int sumWithoutZero = 0;
        for (int i = 1; i < dP; i++) {
            sumWithoutZero += Integer.parseInt(sides[i].toString());
        }
        System.out.println(">>> "+ sumWithoutZero);
        System.out.println(">>> "+(iter-Integer.parseInt(sides[0].toString())));
        double mean = ((double) sum)/(iter-Integer.parseInt(sides[0].toString()));
        System.out.println("mean is: "+ mean);

    }
}
