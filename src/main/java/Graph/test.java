package Graph;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.LinkedList;

public class test {



    public static void main(String[] args) {

        //close to linear time
        LinkedList<String> heh = new LinkedList<>();
        for (int i = 0; i < 2000_000; i++) {
            heh.add("lel"+i);
        }

        System.out.println(heh.size()+", HC: "+System.identityHashCode(heh));

        Date start = new Date();
        LinkedList<String> heh2 = (LinkedList<String>) heh.clone();
        Date end = new Date();

        System.out.println(end.getTime()-start.getTime());
        System.out.println(heh2.size()+", HC: "+System.identityHashCode(heh2));
    }

}
