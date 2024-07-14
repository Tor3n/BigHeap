package aHeap.unsrted;

import java.util.ArrayList;

public class ValueofTest {
    public static void main(String[] args) {
        ValueofTest.test();
    }

    static void test(){
        ArrayList<String> arl = new ArrayList<String>();
        arl.add("HALO");
        Object oo = new String[]{"AA","bB"};

        if (oo instanceof java.util.ArrayList){
            System.out.println("hehe " + ((ArrayList<String>) oo).get(0));
        } else if(oo instanceof String[]){
            System.out.println("hehe2 " + ((String[]) oo)[0]);
        }
    }
}
