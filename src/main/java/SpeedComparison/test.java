package SpeedComparison;

import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.LinkedList;

public class test {



    public static void main(String[] args) {

        LinkedListTest();
        System.out.println("***********");
        ArrayDequeTest();
    }

    public static void LinkedListTest(){
        //close to linear time
        LinkedList<String> heh = new LinkedList<>();
        for (int i = 0; i < 12000_000; i++) {
            heh.add("lel"+i);
        }

        System.out.println(heh.size()+", HC: "+System.identityHashCode(heh));

        int start = Instant.now().getNano();
        LinkedList<String> heh2 = (LinkedList<String>) heh.clone();
        int end = Instant.now().getNano();

        System.out.println("it took, s: "+(end-start)*10e-9);
        System.out.println(heh2.size()+", HC: "+System.identityHashCode(heh2));
    }


    public static void ArrayDequeTest(){
        //close to something
        ArrayDeque<String> heh = new ArrayDeque<>();
        for (int i = 0; i < 14000_000; i++) {
            heh.add("lel"+i);
        }

        System.out.println(heh.size()+", HC: "+System.identityHashCode(heh));


        int start = Instant.now().getNano();
        ArrayDeque<String> heh2 = (ArrayDeque<String>) heh.clone();
        int end = Instant.now().getNano();

        System.out.println("it took, s: "+(end-start)*10e-9);
        System.out.println(heh2.size()+", HC: "+System.identityHashCode(heh2));
    }
}
