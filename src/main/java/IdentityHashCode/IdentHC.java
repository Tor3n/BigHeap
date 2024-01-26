package IdentityHashCode;

import java.util.ArrayList;

public class IdentHC {

    public static void main(String[] args) {
        ArrayList h = new ArrayList();
        h.add(1);
        Object o = new Object(){
            int a = 1;

            public String he(){
                //System.out.println("heheh");
                return "";
            }
        }.he();


        identity(new Object() {
            void fn() {
                //System.err.println("dfghdfghd");
            }
        }).fn();

        System.out.println(System.identityHashCode(h));
        System.out.println(h.hashCode());

        Object s1 = "abcd";
        Object s2 = new String("abcd");
        Object s3 = "abcd";
        System.out.println("identityHashCode : " + System.identityHashCode(s1) + " HashCode : " + s1.hashCode());
        System.out.println("identityHashCode : " + System.identityHashCode(s2) + " HashCode : " + s2.hashCode());
        System.out.println("identityHashCode : " + System.identityHashCode(s3) + " HashCode : " + s3.hashCode());

    }

    private static <T> T identity(T val) {
        return val;
    }
}
