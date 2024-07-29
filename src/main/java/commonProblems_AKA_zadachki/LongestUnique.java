package commonProblems_AKA_zadachki;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LongestUnique {
    static TreeSet<String> st = new TreeSet<>((o1, o2) -> Integer.compare(o2.length(), o1.length()));
    //this one allows for duplicates
    static TreeSet<String> st2 = new TreeSet<>( );

     @Test
     public void goFindTest(){
         //Assertions.assertEquals(goFind("abcabcbb"),"abc");
         //goFind("abcabcbb");
         checInsert();
         //Assertions.assertEquals(goFind("pwwkew"),"wke");
     }

     public static void checInsert(){
         st2.add("ab");
         st2.add("kk");
         st2.add("1");
         st2.add("kk");
         System.out.println(st2);
     }

    public static String goFind(String input){
        LinkedHashSet<Character> storage = new LinkedHashSet<>();
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length; i++) {
            storage.clear();
            storage.add(inputArr[i]);

            for (int j = i+1; j < inputArr.length-1; j++) {
                if (!storage.contains(inputArr[j])) {
                    storage.add(inputArr[j]);
                } else {
                    break;
                }

            }

            String ident =  storage.stream().map(String::valueOf).reduce("", (a, b) -> (a+b));
            System.out.println(ident);
            st.add(ident);
        }
        System.out.println(st);

        return st.pollFirst();
    }
}
