package interView;

import java.util.Arrays;

public class linkTransferInsidePrivate { }

class Heh{
    private int[] zet={1,2,3};

    public int[] getter(){
        return zet;
    }
}

class TestApp4 extends Heh {
    public static void main(String args[]) {
        Heh h = new Heh();
        int[] kek = h.getter();
        kek[0] = 3;
        System.out.println(Arrays.toString(h.getter()));
    }

}