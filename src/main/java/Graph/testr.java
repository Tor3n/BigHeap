package Graph;

import java.util.ArrayList;

public class testr {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("AB");
        a.add("ABS");
        System.out.println("BFR "+a);

        for(String s : a){
            if(s.endsWith("S")){
                a.remove(s);
            }
        }

        System.out.println("AFT "+a);
    }
}
