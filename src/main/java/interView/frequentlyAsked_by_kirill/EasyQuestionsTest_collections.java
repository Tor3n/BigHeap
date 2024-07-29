package interView.frequentlyAsked_by_kirill;


import interView.inheritance_polym.B;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class EasyQuestionsTest_collections {



    @Test
    public void ObjectsByValue(){
       //https://howtodoinjava.com/java-examples/internal-cache-wrapper-classes/
       //0-127  we can check Int==Intt
        Integer a1=120;
        Integer b1=120;
        System.out.println("1: "+(a1==b1));

        System.out.println("*************");

        Integer a=1111111;
        Integer b=1111111;
        System.out.println(a==b);

        System.out.println("****************");
        //new Always creates new objects on the heap
        System.out.println(new Integer(10)==new Integer(10));
        System.out.println("but");
        System.out.println(new Integer(10).equals(new Integer(10)));
    }

    @Test
    public void Boolea(){
       //depreciated
       Boolean one = new Boolean(false);
       Boolean two = Boolean.FALSE;
       System.out.println(one==two);

       System.out.println("and as normal people would do");
       System.out.println(false==Boolean.FALSE);
    }


    @Test
    public void hashMapEqualsHashcode_demo1(){
       //long is immutable
       Map<Long, Long> map = new HashMap<>();
       map.put(1L, 1L);
       Long val = map.get(1L);
       System.out.println(val.equals(1L));

       //this is how nodes are found inside the getNode function in HashMap: len & hashcode
        // first = tab[(n - 1) & (hash = hash(key))]

        // static final int TREEIFY_THRESHOLD = 8;
    }

    @Test
    public void hashMapEqualsHashcode_demo2(){
       //mutable key
        Map<Long, Long> map = new HashMap<>();
        map.put(1L, 1L);
        Map<Map<Long, Long>, Long> multyMap = new HashMap<>();
        multyMap.put(map, 3l);

        //mutate a map:
        map.put(2L, 2L);
        map.put(3L, 2L);
        Long mutant = multyMap.get(map);

        //we cant get the object
        System.out.println(mutant);
        System.out.println("*****");
        System.out.println(1<<30);
    }

    /**
     * Read more: https://www.baeldung.com/java-collections
     */
    @Test
    public void collectionFramework_Demo() {
        // iterable -> collection -> list, queue, set
        // map not in collections

        //иногда лучше разметить область памяти и просто ходить со смещением адресов по аррей листу
        List<Integer> arrayList = new ArrayList<>();        arrayListTimeComplexity();
        //итерироваться бывает долго и сложно по линкед листу т.к. выделяет объекты произвольно в куче
        List<Integer> linkedList = new LinkedList<>();          linkedlistTimeComplexity();
        //threadSafe arraylist
        List<Integer> copyOnWrite = new CopyOnWriteArrayList<>();       copyOnWriteArrayListComplexity();
        //all of get() and set() methods are synchronized (only one thread can modify)  can't have fine control over synchronization
        List<Integer> vector = new Vector<>();  //otherwise it is an arraylist
        // stack follows the principle of last in first out(LIFO) which means that the last element inserted into the stack should be removed first.
        //stack is synchronized just like vector there is a vector inside
        List<Integer> stack = new Stack<>();        stackTimeComplexity();

        //TODO *****************************************************************************

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> linkedListQueue = new LinkedList<>();
        //based on array
        Queue<Integer> arrayListQueue = new ArrayDeque<>();

        //TODO *****************************************************************************

        //set has a HashMap inside
        Set<Integer> hashSet = new HashSet<>();
        //HashMap inside, so O(1) but it maintains order
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        // usually O(log(n))
        Set<Integer> treeSet = new TreeSet<>();

        // map is not in collections

        Map<Integer, Integer> hashMap = new HashMap<>();            HashMapTimeComplexity();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        // usually O(log(n)) ordered
        Map<Integer, Integer> treeMap = new TreeMap<>();
        // specific map for enum values
        //Map<Integer, Integer> enumMap = new EnumMap<>();
    }

    private void HashMapTimeComplexity() {

        /*
            without collisions:
                get() - O(1)
                put() - O(1)
                remove() - O(1)
            with collisions:
                get() - O(n) or if treefied O(log(n))
         */
    }

    private void stackTimeComplexity() {
        /*
            push - O(1)  In the push function a single element is inserted at the last position.
                This takes a single memory allocation operation which is done in constant time.
            pop() - O(1)
            peek() - O(1)
            isEmpty() - O(1)
            size() - O(1)
         */
    }

    private void linkedlistTimeComplexity() {
        /*
        LinkedList is a linear data structure that consists of nodes holding a data field and a reference to another node. For more LinkedList features and capabilities, have a look at this article here.

            add() – appends an element to the end of the list. It only updates
                a tail, and therefore, it’s O(1) constant-time complexity.
            add(index, element) – on average runs in O(n) time
            get() – searching for an element takes O(n) time.
            remove(element) – to remove an element, we first need to find it. This operation is O(n).
            remove(index) – to remove an element by index, we first need to follow the
                links from the beginning; therefore, the overall complexity is O(n).
            contains() – also has O(n) time complexity

         */
    }

    private void copyOnWriteArrayListComplexity() {
        /*
            This implementation of the List interface is beneficial when working with multi-threaded applications.
            It’s thread-safe and explained well in this guide here.
            https://www.baeldung.com/java-copy-on-write-arraylist

            add() – depends on the position we add value, so the complexity is O(n)
            get() – is O(1) constant time operation
            remove() – takes O(n) time
            contains() – likewise, the complexity is O(n)

            As we can see, using this collection is very expensive because of the performance characteristics of the add() method.
         */
    }

    private void arrayListTimeComplexity() {

        //The ArrayList in Java is backed by an array.
        /*
            add() – takes O(1) time; however, worst-case scenario, when a new array has to be created
                and all the elements copied to it, it’s O(n)
            add(index, element) – on average runs in O(n) time
            get() – is always a constant time O(1) operation
            remove() – runs in linear O(n) time. We have to iterate the entire array to
                find the element qualifying for removal.
            indexOf() – also runs in linear time. It iterates through the internal array and
                checks each element one by one, so the time complexity for this operation always requires O(n) time.
            contains() – implementation is based on indexOf(), so it’ll also run in O(n) time.
         */

    }


}
