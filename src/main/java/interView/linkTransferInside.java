package interView;

import java.util.Arrays;

public class linkTransferInside {
}

class TestApp3 {

    public static void main(String args[]) {
        int i[] = {1,2,3};
        alter(i);
        System.out.println(Arrays.toString(i));
    }

    public static void alter(int i[]) {
        i[0]=3;
    }

}