package SpeedComparison;


import miniProjects.Point;

import java.io.*;
import java.time.Instant;
import java.util.*;

public class TestLLandADQ {

    public static void main(String[] args) throws IOException {


        ArrayList<miniProjects.Point> ll = LinkedListTest(20);

        try (FileOutputStream fo = new FileOutputStream("C:\\Users\\Toren\\IdeaProjects\\untitled\\out\\result\\ll.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fo);){
            oos.writeObject(ll);
            oos.flush();
        }


        System.out.println("***********");
        ArrayList<miniProjects.Point> adq = ArrayDequeTest(20);

        try (FileOutputStream fo = new FileOutputStream("C:\\Users\\Toren\\IdeaProjects\\untitled\\out\\result\\ArdQ.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fo);){
            oos.writeObject(adq);
            oos.flush();
        }


    }

    public static ArrayList<miniProjects.Point> LinkedListTest(int number){
        ArrayList<miniProjects.Point> result = new ArrayList<>();


        for (int i = 1; i < number+1; i++) {

            LinkedList<String> heh = new LinkedList<>();
            for (int j = 0; j < 500_000*i; j++) {
                heh.add("lelasdfasdfasfdsdfasdfsdfasdas"+j);
            }

            //System.out.println(heh.size()+", HC: "+System.identityHashCode(heh));


            int start = (int) new Date().getTime();
            LinkedList<String> heh2 = (LinkedList<String>) heh.clone();
            int end = (int) new Date().getTime();

            miniProjects.Point a = new Point(i, (int) ((end-start)));
            result.add(a);
            System.out.println("it took, ms: "+(end-start));
            //System.out.println(heh2.size()+", HC: "+System.identityHashCode(heh2));
        }


        return result;
    }

    public static ArrayList<miniProjects.Point> ArrayDequeTest(int number){
        ArrayList<miniProjects.Point> result = new ArrayList<>();

        for (int i = 1; i < number+1; i++) {

            ArrayDeque<String> heh = new ArrayDeque<>();
            for (int j = 0; j < 500_000*i; j++) {
                heh.add("lelasdfasdfasfdsdfasdfsdfasdas"+j);
            }

            //System.out.println(heh.size()+", HC: "+System.identityHashCode(heh));


            int start = (int) new Date().getTime();
            ArrayDeque<String> heh2 = (ArrayDeque<String>) heh.clone();
            int end = (int) new Date().getTime();

            miniProjects.Point a = new Point(i, (int) ((end-start)));
            result.add(a);
            System.out.println("it took, ms: "+(end-start));
            //System.out.println(heh2.size()+", HC: "+System.identityHashCode(heh2));
        }


        return result;
    }

}
